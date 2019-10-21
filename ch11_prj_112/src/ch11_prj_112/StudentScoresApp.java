
package ch11_prj_112;

import java.util.Arrays;

public class StudentScoresApp {

	public static void main(String[] args) {

		//count hw many times thru loop to dump out at input value numOfStudents
		int counter = 0;
		
	    // display a welcome message
        System.out.println("Welcome to Student Score App");
        System.out.println();

        int numOfStudents = Console.getInt("Enter number of students [1 thru 500]:", 1, 501);
        
        Student[] studentArray =new Student[numOfStudents];
        
        
        // perform 1 or more calculations
        String choice = "y";
                
        while (choice.equalsIgnoreCase("y")) {
        	
        	System.out.println("STUDENT " + (counter+1) );
        	String firstName = Console.getString("Enter First Name: ");
        	
        	//System.out.println(firstName);
        	//allow for an exit of loop
        	if (firstName.equalsIgnoreCase("exit")){
        		break;
        	}
        	
        	String lastName = Console.getString("Enter Second Name: ");
        	
        	//System.out.println(lastName);
        	
        	int score = Console.getInt("Enter Score [0 thru 100]: ", 0,101);
        	
        	
        	String firstAndLastName = lastName + firstName;
        	
        	
        	
        	
        	studentArray[counter] = new Student(firstName.toLowerCase(), lastName.toLowerCase(), firstAndLastName.toLowerCase(), score);
        	
        	
//        	System.out.println(studentArray[counter]);
        	
        	counter++;
        	
        	// see if the user wants to continue
        	if (counter == numOfStudents) {
        		break;
        	}
        	
//        	else {
//        		choice = Console.getString("Continue? (y/n): ");
//        		System.out.println();
//        	}
//        	
        	
        }
        
        // this is where to put summary out of while loop
        System.out.println();
        System.out.println("SUMMARY");
        
        //sort array by last name then first name
        Arrays.sort(studentArray);
        
        for (Student s: studentArray) {
        	System.out.println(s);
        }
        
        
        System.out.println();
        System.out.println("bye bye");

	}

}
