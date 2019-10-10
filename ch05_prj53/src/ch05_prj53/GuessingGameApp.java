package ch05_prj53;

import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to the Guess the Number Game.\n");
		
		Scanner sc = new Scanner(System.in);
		
		String choice  = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
			//sc.hasNextInt();
		   
			System.out.println("I'm thinking of a number from 1 to 100. ");
			System.out.println("What's the Number: ");
			
			while (!sc.hasNextInt()) {
				
				System.out.println("You have entered an invalid Number, Please Re-Enter:");
				sc.nextInt();
				continue;
				
			}
			
			int guess = sc.nextInt();
			System.out.println(guess);
			
			// ADD BIZ LOGIC CODE HERE
			
			
			
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            sc.nextLine();  // discard any other data entered on the line
            System.out.println();
			
		}
		
		
		System.out.println(" BYE BYE!");
		sc.close();
		
		
		
	}

}
