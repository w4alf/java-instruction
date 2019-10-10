package chapter02_ex2_PerimeterCalc;

import java.util.Scanner;

public class PerimeterCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
System.out.println("Welcome to the Perimeter Calculator");
        
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        
        int numberOfPerimeters = 0;
        double width = 0.0;
        double length = 0.0;
        double perimeter = 0.0;
        double area = 0.0;
        
		
		while (!choice.equalsIgnoreCase("n")) {
			
			// get the width from the user
            System.out.print("Enter Width:   ");
            width = sc.nextDouble();
            
            // get the length from the user
            System.out.print("Enter Length:   ");
            length = sc.nextDouble();
            
            System.out.println();
            
            //count the number of perimeters Calculated
            numberOfPerimeters += 1;
            
            
            // calculate the Perimeter
            perimeter = 2* width + 2*width;
            area = width * length;
            
                       
                               
            // display the discount amount and total
            String message = "Area is: " + area + "\n"
            		+ "Perimeter is: " + perimeter + "\n"
            		+ "Number of Perimeters Calculated: " + numberOfPerimeters + "\n";
                                  
            System.out.println(message);

            // see if the user wants to continue
            
            	  System.out.print("Continue? (y/n): ");
                  choice = sc.next();
                  System.out.println();
                 
        }
   

		
		
	}

}
