package com.sc.assessment.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;

import com.sc.assessment.dao.FXRatesDAO;
import com.sc.assessment.dao.impl.FXRatesDAOImpl;
import com.sc.assessment.exception.UserException;
import com.sc.assessment.model.FXRatesData;
import com.sc.assessment.model.FXResponse;
import com.sc.assessment.model.UserData;
import com.sc.assessment.service.FXRatesService;
import com.sc.assessment.service.UserService;

public class FXRatesServiceImpl implements FXRatesService {

	private FXRatesDAO fxratesDao = new FXRatesDAOImpl();
	private UserService userService = new UserServiceImpl();

	@Override
	public FXResponse getFXRates(String userId) throws ClientProtocolException, IOException, UserException {
		Map<String, Double> fxMap = fxratesDao.getFxRatesData(userId);
		UserData userData = userService.getUserData(userId);
		String pricingTier = userData.getPricingTier();
		FXResponse fxResponse = new FXResponse();
		Map<String, FXRatesData> fxRateDataMap = new HashMap<String, FXRatesData>();
		fxRateDataMap.put("SGD", calculateSpread(pricingTier, fxMap.get("SGD")));
		fxRateDataMap.put("HKD", calculateSpread(pricingTier, fxMap.get("HKD")));
		fxRateDataMap.put("MYR", calculateSpread(pricingTier, fxMap.get("MYR")));
		fxResponse.setRates(fxRateDataMap);
		fxResponse.setBase("USD");
		return fxResponse;
	}

	private FXRatesData calculateSpread(String pricingTier, Double market) {
	
		Double spreadPercent = new Double(0);

		switch (pricingTier) {
		case "A":
			spreadPercent = 2.0;
			break;
		case "B":
			spreadPercent = 3.0;
			break;
		case "C":
			spreadPercent = 4.0;
			break;
		default:
			break;
		}
		Double bid = market - (spreadPercent / 100) * market;
		Double ask = market + (spreadPercent / 100) * market;

		return new FXRatesData(bid, market, ask);
	}
}
