import java.util.Scanner;

public class CommonDivisorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   // welcome the user to the program
        System.out.println("Welcome to the Common Divisor Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		

        // perform calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
      
		
		while (!choice.equalsIgnoreCase("n")) {
			
			
	           System.out.print("Enter The First Number:   ");
	            
	            int x = sc.nextInt();

	            System.out.print("Enter The Second Number:   ");
	            
	            int y = sc.nextInt();
	            
	            int resultx = x;
	            int resulty = y;
	            
	            //temp holders for x and y when swap is needed
	            int tempResultX = 0;
		        int tempResultY = 0;
	            
		        //do initial test of x<y then flip variables if true
	            if (resultx>resulty) {
	            	
	            	tempResultX = resultx;
	  	            tempResultY = resulty;
	  	            resultx = tempResultY;
	  	            resulty = tempResultX;
	            	
	            }
	            
	            
	          //this loop will run until x=0
	           while (resultx > 0) {
	        	
	        	 
	        	   
	        	   // Step 1 - do until y < x 
	        	   while (resulty>resultx)  {
	        		 
	        		   resulty -= resultx; 
	        		  
	        	   }
	        	        	 
	           // Step 2 - swap the values y and x
	           tempResultX = resultx;
	           tempResultY = resulty;
	           resultx = tempResultY;
	           resulty = tempResultX;
	           
	           resulty =  resulty - resultx; 
	           
	          //test x and break out of the loop when x is zero or less
	           if (resultx <= 0) {
	        	   break;
	           }
	        	 
	        	
	        	 
	           }
	            
	           
	            //System.out.println("Estimated Time Traveled");
	            System.out.println("----------------------");
	            System.out.println("The Greatest Common Divisor is: " + resulty);

	                       
	           
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
