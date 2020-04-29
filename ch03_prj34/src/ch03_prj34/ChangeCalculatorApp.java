
// calculates change based on console input

package ch03_prj34;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		//  TODO Auto-generated method stub

		   // welcome the user to the program
        System.out.println("Welcome to the Change Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
      
		
        
        
        while (!choice.equalsIgnoreCase("n")) {
            
            System.out.print("Enter Number of Cents (0-99):   ");
            
            int cents = sc.nextInt();
            
            int quarters = 0;
            int remainder =0;
            int nickels = 0;
            int dimes = 0;
            int pennies = 0 ;
            
            
            remainder = cents;
            
	        while (remainder > 0) {
	        	
	        	 if (remainder>= 25) {
	             	quarters =  (remainder/25);
	             	remainder  = remainder - quarters*25;
	             	System.out.println(remainder);
	             }	
	        	
	         	 if (remainder >= 10) {
		             	dimes =  (remainder/10);
		             	remainder  = remainder - dimes*10;
		             	System.out.println(remainder);
		             }	
	        	
	         	 if (remainder >= 5) {
		             	nickels =  (remainder/5);
		             	remainder  = remainder - nickels*5;
		             	System.out.println(remainder);
		             }	
	 	         	 
	         	 if (remainder < 5) {
		             	pennies =  remainder;
		             	remainder  = 0;
		             	System.out.println(remainder);
		             }	
	         	 
	        }
            
            
            
            
        
            // display the discount amount and total
            String message = "Quarters: " + quarters + "\n"
                      + "Dimes:  " +  dimes + "\n"
                         + "Nickels:    " + nickels + "\n"
                           + "Pennies:    " + pennies + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            
            	  System.out.print("Continue? (y/n): ");
                  choice = sc.next();
                  System.out.println();
                
                  
                  
        }
        
      
        System.out.println("BYE BYE!");
		
		
		
	}

}
