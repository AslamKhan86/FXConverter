package com.sc.assesment.service;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.jupiter.api.Test;

import com.sc.assessment.exception.UserException;
import com.sc.assessment.model.FXResponse;
import com.sc.assessment.service.FXRatesService;
import com.sc.assessment.service.impl.FXRatesServiceImpl;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FXRatesServiceTest {

	@Test
	public void calculateSpreadTest() throws ClientProtocolException, UserException, IOException {
		
		FXRatesService fx = new FXRatesServiceImpl();
		FXResponse fxResponse = fx.getFXRates("1");
		assertNotNull(fxResponse);
	}
}
