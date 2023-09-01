package com.canddella.entity;

public class CurrentAccount extends Account {

	private	String gstNumber;

	public CurrentAccount(String accountNumber, String gstNumber) {
		super(accountNumber);
		this.gstNumber = gstNumber;
		
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	
	
	
}
