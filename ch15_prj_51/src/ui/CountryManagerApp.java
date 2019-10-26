package ui;


import java.util.ArrayList;
import java.util.List;

import business.CountriesIO;
import util.Console;

public class CountryManagerApp {

    // set the class variables
   public static  CountriesIO country = new CountriesIO();
	
	
	public static void main(String[] args) {

		 // display a welcome message
        System.out.println("Welcome to the Customer Manager\n");

 

        // display the command menu
        displayMenu();

		
     // perform 1 or more actions
        String action = "";
        while (!action.equalsIgnoreCase("exit")) {
            // get the input from the user
        	System.out.println();
            action = Console.getString("Enter a command: ");
            System.out.println();

            if (action.equalsIgnoreCase("1")) {
            	//list all countries
                displayAllCountries();
            } else if (action.equalsIgnoreCase("2")) {
                            	
            	//add country
            	addCountry();
            	
            } else if (action.equalsIgnoreCase("3")) {
            	//exit
                System.out.println("Good Bye Please Come again.\n");
            } else {
                System.out.println("Error! Not a valid command.\n");
            }
        }
        
        
        
        

	}
	
    public static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("1    - List all Countries");
        System.out.println("2    - Add a Country");
        System.out.println("3    - Exit");

    }

    public static void displayAllCountries() {
        System.out.println("COUNTRY LIST");

       ArrayList<String> countries = new ArrayList<String>(); 
       countries = country.getCountries();
              
       for (int i = 0; i < countries.size(); i++) {
    	   	System.out.println(countries.get(i));
       }
       
     }

    public static void addCountry() {
       
    	String countryName = Console.getString("Enter Country: ");
    	

        ArrayList<String> countries = new ArrayList<String>(); 
        countries = country.getCountries();
        
        countries.add(countryName);
    
    	boolean isValidSave = false;
    	
    	isValidSave = country.saveCountries(countries);

    	if (isValidSave) {
    		System.out.println("Country: "+ countryName + " was added.");
    		
    	} else {
    		System.out.println("Save failed");
    	}
       
     }
    
    
    
}
