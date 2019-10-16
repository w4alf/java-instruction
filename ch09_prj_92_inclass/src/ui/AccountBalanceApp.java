package ui;

import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;

import util.Console;

public class AccountBalanceApp {
	
	static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		
		System.out.println("Welcome the the Account Balance Application.");

		CheckingAccount ca = new CheckingAccount(1000,1);
		SavingsAccount sa = new SavingsAccount(1000,.01);
		
		System.out.println("Starting Balances:");
		displayBalances(ca,sa);
		System.out.println("Enter Transactions for the month:");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			String txn = Console.getString("Withdraw or Deposit");
			String acct = Console.getString("Checking or Savings?");
			double amt = Console.getDouble("Amount?", 0, Double.POSITIVE_INFINITY);
			
			Account a = null;
			
			if (acct.equalsIgnoreCase("c")) {
				a =ca;
			}
			else if (acct.equalsIgnoreCase("s")) {
				a = sa;
			}
			else {
				System.out.println("Invalid Account type");
				continue;
			}
			
			
			if (txn.equalsIgnoreCase("d")) {
				a.deposit(amt);
			}
			else if (txn.equalsIgnoreCase("w")) {
				a.withdraw(amt);
			}
			else {
				System.out.println("Invalid txn.");
				continue;
			}
			
			
			choice = Console.getString("Continue?");
		}
		
		ca.subtractMonthlyFeeFromBalance();
		sa.applyPaymentToBalance();
		
		
		System.out.println("Monthly Payments and Fees\n");
		System.out.println("checking fee: " + ca.getMonthlyFee());
		System.out.println("Savings Interest Payment: " + sa.getMonthlyInterestPayment());
		
		System.out.println("Final Balances: \n");
		displayBalances(ca,sa);
		
		
		System.out.println("bye bye");
	}

	
	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		
		
		System.out.println("Checking:     "+ cf.format(ca.getBalance()));
		System.out.println("Savings:     "+ cf.format(sa.getBalance()));
	}
}
