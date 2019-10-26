package ui;

import business.Customer;
import db.CustomerDB;
import db.NoSuchCustomerException;
import util.Console;

public class CustomerViewerApp {

	public static void main(String[] args) {
	
			System.out.println("Welcome to the Customer Viewer App.");
			
			String choice ="y";
			
			while (choice.equalsIgnoreCase("y")) {
				
				int custNbr = Console.getInt("Enter the customer number:");
				
				Customer c;
				try {
					c = CustomerDB.getCustomer(custNbr);
					System.out.println();
					
					System.out.println(c.getNameAndAddress());
					
					System.out.println();
				} catch (NoSuchCustomerException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					

					
				}
				

				
				choice = Console.getString("Display another customer? y/n:");
			}
			
			
			
			System.out.println("good bye baby");
	}


}
