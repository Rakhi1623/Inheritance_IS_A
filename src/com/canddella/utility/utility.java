package com.canddella.utility;




import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.entity.Customer;
import com.canddella.service.Service;

public class utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char contChoice = 'y';
		Account account = null;
		do {
		System.out.println("1.Saving account  2.Current Account  3.Display Account Details");
		int choice = scanner.nextInt(); 
		
		switch (choice) {
		case 1:
			account = Service.createAccount(choice);
			break;
		case 2:
			account = Service.createAccount(choice);
			break;
		case 3:
			Service.displayAccountDetails(account);
			break;
		default:
				System.out.println("Invalid Choice");
				
		}
		
		System.out.println("Do you want to continue");
		contChoice=scanner.next().charAt(0);
		
		}while(contChoice=='y');

}
}
