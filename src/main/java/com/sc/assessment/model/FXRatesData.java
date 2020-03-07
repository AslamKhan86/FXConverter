package com.sc.assessment.model;

public class FXRatesData {

	private Double bid;
	private Double market;
	private Double ask;

	public FXRatesData(Double bid, Double market, Double ask) {
		this.bid = bid;
		this.market = market;
		this.ask = ask;
	}

	public Double getBid() {
		return bid;
	}

	public void setBid(Double bid) {
		this.bid = bid;
	}

	public Double getMarket() {
		return market;
	}

	public void setMarket(Double market) {
		this.market = market;
	}

	public Double getAsk() {
		return ask;
	}

	public void setAsk(Double ask) {
		this.ask = ask;
	}
}
