package com.canddella.service;

import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.entity.CurrentAccount;
import com.canddella.entity.Customer;
import com.canddella.entity.SavingsAccount;

public class Service {

	public static Account createAccount(int choice) {
		// TODO Auto-generated method stub
		Account account = null;
		if(choice==1) {
			account = new SavingsAccount("SA100","5%");
		}
			else if(choice==2) {
				account = new CurrentAccount("CA100","GST100");
			}
			return account;
		} 
	
	
	public static void displayAccountDetails(Account account) {
		// TODO Auto-generated method stub
		SavingsAccount savingsAccount=null;
		CurrentAccount currentAccount = null;
		if(account instanceof SavingsAccount) {
			savingsAccount = (SavingsAccount)account;
			System.out.println(savingsAccount.getAccountNumber()+"  "+savingsAccount.getRateOfInterest());
		}
			else if (account instanceof CurrentAccount) {
				currentAccount = (CurrentAccount)account;
				System.out.println(currentAccount.getAccountNumber() + "  "+ currentAccount.getGstNumber());
				
				
		}
			
		
	}
	
}
