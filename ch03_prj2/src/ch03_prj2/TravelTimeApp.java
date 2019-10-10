package ch03_prj2;

//import java.text.NumberFormat;
import java.util.Scanner;
//import java.lang.Math;

public class TravelTimeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Welcome to the Travel Time calculator");
	        System.out.println();  // print a blank line
	        
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            System.out.print("Enter miles driven: ");
	            double miles = sc.nextDouble();
	            
	            System.out.print("Enter Mile Per Hour: ");
	            double mph = sc.nextDouble();
	            
	            double hours = miles/mph;
	                       	            
	            int minutes = (int) (hours*60); 
	           
	            int hoursInt = minutes/60;
	            int minutesInt = minutes % 60;
	            
	            
	            

	            
	            // Use the Number Format object to format to 3 decimal places.
	           // NumberFormat number = NumberFormat.getNumberInstance();
	            //number.setMaximumFractionDigits(2);
	            //String answerFormat = number.format(minutesRemainder);
	            
	            
	            System.out.println("Estimated Time Travelled");
	            System.out.println("----------------------");
	            System.out.println("Hours: " + hoursInt);
	            System.out.println("Minutes: " + minutesInt);
	                       
	            System.out.print("Calculate another MPG? (y/n): ");
	            choice = sc.next();
	            System.out.println();
	            
	            
	        }
	        
	        sc.close();
	        System.out.println("Bye Bye!");
		
		
		
	}

}
