package com.sc.assessment.model;

public class UserData {

	private int userId;
	private String pricingTier;
	private String emailAddress;

	public UserData(int userId, String pricingTier, String emailAddress) {
		this.userId = userId;
		this.pricingTier = pricingTier;
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPricingTier() {
		return this.pricingTier;
	}

	public void setPricingTier(String pricingTier) {
		this.pricingTier = pricingTier;
	}

}
