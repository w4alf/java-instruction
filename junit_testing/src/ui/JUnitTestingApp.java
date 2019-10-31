package ui;

import business.JUnitTesting;
import util.Console;

public class JUnitTestingApp {

	public static void main(String[] args) {
	
		JUnitTesting testing = new JUnitTesting();
		int squared  = Console.getInt("Enter an Integer: ");
		 
		String charACount = Console.getString("Enter a String: ");
	
		
		System.out.println("the square of "+ squared + " is " +testing.square(squared));
		System.out.println("the number of A's in the string is/are: " +testing.countA(charACount));
	}

}
