package com.sc.assessment.model;

import java.util.Map;

public class FXResponse {
	private Map<String, FXRatesData> rates;
	private String base;

	public Map<String, FXRatesData> getRates() {
		return rates;
	}

	public void setRates(Map<String, FXRatesData> rates) {
		this.rates = rates;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

}
