package chapter02_exercise_22;

import java.util.Scanner;

public class GradingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Test Score grader. Inputting a test score 0 to 100 will convert it to a grade A thru F.");
        
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        
        int numberOfScores = 0;
        double avgScoreAmount = 0.0;
        double scoreAmountTotal = 0.0;
		
		while (!choice.equalsIgnoreCase("n")) {
			
			// get the test score from the user
            System.out.print("Enter Numerical Grade:   ");
            double testScore = sc.nextDouble();
           
            //count the number of invoices
            numberOfScores += 1;
            scoreAmountTotal = scoreAmountTotal + testScore;
            
            // calculate the discount amount and total
            String letterGrade;
            if (testScore <60) {
                letterGrade = "F";
            } else if (testScore >=60 && testScore <= 66) {
            	letterGrade = "D";
            } else if (testScore >=67 && testScore <= 79) {
            	letterGrade = "C";
            } else if (testScore >=80 && testScore <= 87) {
            	letterGrade = "B";	
            
            } else {
            	letterGrade = "A";
            }
            
          
            
                               
            // display the discount amount and total
            String message = "Letter Grade: " + letterGrade + "\n";
                                  
            System.out.println(message);

            // see if the user wants to continue
            
            	  System.out.print("Continue? (y/n): ");
                  choice = sc.next();
                  System.out.println();
                 
        }
   
        
			avgScoreAmount = scoreAmountTotal/numberOfScores;
		
        	String avgLetterGrade;
        
	        if (avgScoreAmount <60) {
	        	avgLetterGrade = "F";
	        } else if (avgScoreAmount >=60 && avgScoreAmount <= 66) {
	        	avgLetterGrade = "D";
	        } else if (avgScoreAmount >=67 && avgScoreAmount <= 79) {
	        	avgLetterGrade = "C";
	        } else if (avgScoreAmount >=80 && avgScoreAmount <= 87) {
	        	avgLetterGrade = "B";	
	        
	        } else {
	        	avgLetterGrade = "A";
	        }
        
				
	        // display the discount amount and total
	        String message2 = "Number of Scores: " + numberOfScores + "\n"
                       + "Avg. Numerical Grade:  " + avgScoreAmount + "\n"
                       + "Avg. Letter Grade:  " + avgLetterGrade + "\n";
       
	        System.out.println(message2);
     
	        System.out.println("Bye Bye!");
		
		
		
		
	}

}
