package ch03_prj33;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // welcome the user to the program
        System.out.println("Welcome to the Interest Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
      
		
        
        
        while (!choice.equalsIgnoreCase("n")) {
            // get the loan amount from the user
            System.out.print("Enter subtotal:   ");
            
            BigDecimal loanAmount = sc.nextBigDecimal();
            loanAmount.setScale(2, RoundingMode.HALF_UP);
            
           
            // get the interest rate from the user
            System.out.print("Enter Interest Rate:   ");
            
            BigDecimal interestRate = sc.nextBigDecimal();
            
            interestRate.setScale(3, RoundingMode.HALF_UP);
            
            BigDecimal interestAmount = loanAmount.multiply(interestRate)
            		.setScale(2,RoundingMode.HALF_UP);
           
            //set up currency format
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            currency.setMaximumFractionDigits(2);
            //set up number format
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(2);
            
            String strLoanAmount = currency.format(loanAmount);
     
            
            String strInterestRate = percent.format(interestRate);
            
           String strinterestAmount = currency.format(interestAmount);
            
            
           
            // display the discount amount and total
            String message = "Loan Amount: " + strLoanAmount + "\n"
                           + "Interest Rate:  " +  strInterestRate + "\n"
                           + "Interest:    " + strinterestAmount + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            
            	  System.out.print("Continue? (y/n): ");
                  choice = sc.next();
                  System.out.println();
                
                  
                  
        }
        
      
        System.out.println("BYE BYE!");

		
		
		
		
		
		

	}

}
