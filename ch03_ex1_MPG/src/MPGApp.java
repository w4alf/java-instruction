import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;


public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
            double mpg = miles/gallons;
            
            int intMpg = (int) Math.round(miles/gallons);
            double mpg2Dec = (double) Math.round(miles/gallons*100)/100;
            
            // Use the Number Format object to format to 3 decimal places.
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
           
            
            
            
            System.out.println("Miles per gallon no Rounding: " + mpg);
            System.out.println("Miles per gallon int Rounding: " + intMpg);
            System.out.println("Miles per gallon 2 decimal Rounding: " + mpg2Dec);
            System.out.println("Miles per gallon Format Rounding to 2: " + number.format(mpg));
            System.out.println(number.format(mpg)); 
           
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
            
            
        }
        
        System.out.println("Bye Bye!");
    }
    
}
