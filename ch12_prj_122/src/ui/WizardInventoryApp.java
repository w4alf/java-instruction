package ui;

import java.util.ArrayList;
import java.util.List;


import util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Wizard Inventory App");
		

		//getDisplay();
		
		List<String> bag = new ArrayList<>(4);
		bag.add("wooden staff");
		bag.add("wizard hat");
		bag.add("cloth shoes");

		
		String cmd = "";
		//int itemNum = 0;
		
		while (cmd !="exit") {
			
			getDisplay();
			
			cmd = Console.getString("Enter a Command: ");
			
			//logic for each command
			
						
			if (cmd.equalsIgnoreCase("exit")) {
				
				break;
			} else if (cmd.equalsIgnoreCase("show")) {
				
				for (int i=0; i < (bag.size()); i++) {
					System.out.println((i+1)+ ". "+bag.get(i)+"");
				}
				System.out.println();
			} else if (cmd.equalsIgnoreCase("grab")) {
			
				
				
				if (bag.size()<=3) {
					String grabItem = Console.getString("Name: ");
					bag.add(grabItem);
				}
				else {
					System.out.println("Can't carry anymore items. Drop something first");
				}
				
			} else if (cmd.equalsIgnoreCase("drop")) {
			
				
					int dropItem = Console.getInt("Enter Item Number: ");
					
					if (dropItem >= 1 && dropItem <= bag.size() )  {
						bag.remove((dropItem-1));
					}
					else {
						System.out.println("Invalid Item Number.Try Again.");
					}
					
			
				
			} else if (cmd.equalsIgnoreCase("edit")) {
					
				int editIndex = Console.getInt("Enter Item Number: ");
				
				if (editIndex >= 1 && editIndex <= bag.size() )  {
					
					String newItem = Console.getString("Enter Updated Name: ");
					
					if (newItem==null || newItem.equalsIgnoreCase("")) {
						
						System.out.println("Invalid Name.Try Again.");
						continue;
						
					} else {
						
						bag.set((editIndex-1), newItem);
						
						System.out.println("Item Number is: "+ editIndex);
					}
					
					
				}
				else {
					System.out.println("Invalid Item Number.Try Again.");
				}
				
			} else {
				
				System.out.println("Invalid Command. Please try Again.");
			}
				
			
			
			
		
			
			
		}
		
		System.out.println();
		System.out.println("Thank you for Coming, Please Come Again, BYE BYE.");
		
		
		
	}

	
	public static void getDisplay() {
		
		System.out.println();
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit Program");
		System.out.println();
	}
	
	
}
