package com.canddella.entity;

public class SavingsAccount extends Account {

	private	String rateOfInterest;

	public SavingsAccount(String accountNumber, String rateOfInterest) {
		super(accountNumber);
		this.rateOfInterest = rateOfInterest;
		
	}

	public String getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
	
	
}
