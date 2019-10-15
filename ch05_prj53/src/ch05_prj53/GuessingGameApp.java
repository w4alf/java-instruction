package ch05_prj53;

import java.util.Scanner;

public class GuessingGameApp {
	
   //method gets a valid int from user
	public static int getValidInt(Scanner sc, String prompt) {
        
    	int i = 0;
        boolean isValid = false;
        
        while (isValid == false) {
           
        	System.out.print(prompt);
           
        	if (sc.hasNextInt()) {
            	
        		 i = sc.nextInt();
        		 
            	//validation of range
    			if (i >= 1 && i <=100) {
    				isValid = true;
    				
    			} else {
    				System.out.println("Invalid range for integer. Try again.");
    			}
           	   
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }
  
    
    //method returns a random number based on constant set for upper limit
    public static int getRandomInt(int UPPER_LIMIT) {
    	
    	// create the random number
    	int rdmNumber = (int) (Math.random() * UPPER_LIMIT);
    	rdmNumber++; //Math.Random returns from 0 to <1 range..
    	return rdmNumber;
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Display intial header
		System.out.println("Welcome to the Guess the Number Game.");
		System.out.println("--------------------------------------- ");
		System.out.println("I'm thinking of a number from 1 to 100. ");

		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
	
		
		//Constant set for limit of guessing
		final int UPPER_LIMIT = 100;

		//will cont number of attempts for tracking
		int counter = 1;
		
		//initial variable holding user's guess
		int guess =0;
		

		
		
		
		while (choice.equalsIgnoreCase("y")) {
			
			// Call random int method to get our random number
			int randomNumber = getRandomInt(UPPER_LIMIT);
			
			//System.out.println(randomNumber);
			
			//call method to validate and return a valid int from user via a method..
			guess = getValidInt(sc,"What's the Number?: ");
		
			
			// checks the number for how close it is and increments attempts counter	
			while (guess != randomNumber) {
				
				
				if ((guess - randomNumber) > 0 && Math.abs(guess - randomNumber)> 10) {
					System.out.println("Your Number is way too high! ");
					guess = getValidInt(sc,"Guess Again: ");
					counter++;
					
				} 
				
				else if ((guess - randomNumber) < 0 && Math.abs((guess - randomNumber)) >10){
					System.out.println("Your Number is way too low! ");
					guess = getValidInt(sc,"Guess Again: ");
					counter++;
					
				}
				
				else if (guess > randomNumber){
					System.out.println("Your Number is too High. ");
					guess = getValidInt(sc,"Guess Again: ");
					counter++;
					
				}
				
				else if (guess < randomNumber){
					System.out.println("Your Number is too Low. ");
					guess = getValidInt(sc,"Guess Again: ");
					counter++;
					
				}
				
			
			
			}

			
			
				// message based on number of attempts
				System.out.println("You Guessed it in " + counter + " attempt(s).");
				System.out.println();
				
				if (counter <= 3) {
					System.out.println("Great work you are a mathematical Wizard!");
					System.out.println();
				} else if (counter > 3 && counter <= 7){
					System.out.println("Not too bad you've got some potential.");	
					System.out.println();
				} else if (counter > 7) {
					System.out.println("What took you so long? Maybe you should take some lessons.");
					System.out.println();
				}
			
				guess = 0;
				counter = 0;
						
				//new code begin
				
//				boolean isValid =false;
//				
//		        while (!isValid) {
//		        	System.out.print("Continue? (y/n): ");
//		        	choice = sc.next();
//		      
//		        	
//		            if (!choice.equalsIgnoreCase(" ") && choice.equalsIgnoreCase("y") && choice.equalsIgnoreCase("n")) {
//		            	 System.out.println("Error! Invalid integer value. Try again.");
//		                
//		            } else {
//		            	isValid = true;
//		            }
//		            sc.nextLine();  // discard any other data entered on the line
//		        }
//					
//				}
//				
		
				// new code end

				
				
				System.out.print("Continue? (y/n): ");
				choice = sc.next();
				//sc.nextLine(); // discard entire line
				System.out.println();
	
				System.out.println(" BYE BYE!");
				sc.close();
			
				
			
		}
	}
	

	}


