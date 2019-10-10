
package ch04_prj42;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // welcome the user to the program
        System.out.println("Welcome to the Factorial Calculator");
        System.out.println("-----------------------------------");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

        // perform calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
      
		
		while (!choice.equalsIgnoreCase("n")) {
			
			   System.out.println();
	           System.out.print("Enter an Integer greater than zero and less than 21:   ");
	            
	            long x = sc.nextLong();
	            
	            if (x>20) {
	            	System.out.println();
	            	System.out.println("Invalid integer please input a smaller integer due to precision");
	            	continue;
	            }
	            
	            // the L is used to set a long
	            long xFactorial= 1L ;
	            		
	      
		       
		        // max factorial positive was "25" with a factorial of 
	            // 2432902008176640000 factorial of 20
	            // 9223372036854775807 max limit of long - 8 bytes/64bits
	            // factorial of 26 is too large
	            
		       
	            // will loop 1 thru the input from user...
	            for(int i=1;i<=x;i++) {
		        	
		        	xFactorial = xFactorial *i;
		        	System.out.println(xFactorial);
		        }
	           
	         
		        System.out.println("-----------------------------------");
	            System.out.println("The Factorial is: " + xFactorial);

	                       
	           
	           // see if the user wants to continue
	            System.out.println();
	            System.out.println();
	         	System.out.print("Continue? (y/n): ");
	               choice = sc.next();
	               System.out.println();     
	   
             
	           
	           
		}
			sc.close();	
		 	System.out.println("BYE BYE!");

		
		
	}

}
