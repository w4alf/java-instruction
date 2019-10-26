package ui;

import java.util.List;

import business.Stuffy;

import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {
	
	private static StuffyDB sdb = new StuffyDB();

	public static void main(String[] args) {

		System.out.println("Welcome to the Stuffy Dispenser App");

		
		
		
		int command = 0;
		
		Stuffy s = new Stuffy(); // i added this
		
		
		while (command !=6) {
			
			command = Console.getInt(getMenu(),0, 7);
			
			switch (command) {
			case 1:
				//list 
				List<Stuffy> allStuffies = sdb.getAll();
				
				System.out.println();
				System.out.println("All Stuffies:");
				for (Stuffy sList: allStuffies) {
					System.out.println(sList.toString());
				}
				
				System.out.println();
				
				break;
			case 2:
				//get
				int id = Console.getInt("Enter Stuffy Id: ");
				s = getStuffy(id);
				
				
				
				
				break;
			case 3:
				//add 
				String type3 = Console.getString("Type: ");
				String color3 = Console.getString("color: ");
				String size3 = Console.getString("size: ");
				int limbs3 = Console.getInt("limbs: ");
				
				s = new Stuffy(type3,color3,size3, limbs3);
				
				int rowCount = sdb.add(s);
				System.out.println();
				System.out.println("Success.  " + rowCount + " Stuffy added. ");
				System.out.println();
				
				break;
			case 4:
				//edit
				int idEdit = Console.getInt("Enter Stuffy Id to edit: ");
				Stuffy sEdit = getStuffy(idEdit);
				
	
				if (!(sEdit==null)) {
					
					System.out.println();
					System.out.println("Enter the info below to edit the Stuffy.");
					String type4 = Console.getString("Type: ");
					String color4 = Console.getString("color: ");
					String size4 = Console.getString("size: ");
					int limbs4 = Console.getInt("limbs: ");

					sEdit.setType(type4);	
					sEdit.setColor(color4);
					sEdit.setSize(size4);
					sEdit.setLimbs(limbs4);
					
					rowCount = sdb.update(sEdit);

					if (rowCount == 0) {
						System.out.println("Error. The stuffy was not edited successfully.");
					} else {
						System.out.println("Success. The Stuffy was edited.");
						System.out.println();
					}
				} else {
					
					System.out.println();
					break;
				}
				
				
				break;
			case 5:
				//delete
				int idDelete = Console.getInt("Enter Stuffy Id to delete: ");
				Stuffy sDelete = getStuffy(idDelete);
		
				rowCount = sdb.delete(sDelete);
				
				if (rowCount == 0) {
					System.out.println("Error. The stuffy was not deleted.");
				} else {
					System.out.println("Success. The Stuffy was deleted.");
					System.out.println();
				}
				
				
				
				break;
			case 6:
				//exit
				break;
			default:
				//Error
				System.out.println("Invalid command!");
				break;
			}
			
		}
		
		byeBye();
	}
	
	private static String getMenu() {
		String menu = "COMMAND MENU:\n" +
					  "1 - List \n" +
					  "2 - Get \n" +
					  "3 - Add \n" +
					  "4 - Edit \n" +
					  "5 - Delete \n" +
					  "6 - Exit \n" +
					  "Command: ";
		return menu;
	}
	
	private static Stuffy getStuffy(int id) {
		
		Stuffy s = sdb.get(id);
		
		if (s!=null) {
			System.out.println();
			System.out.println("Stuffy: ");
			System.out.println(s);
			System.out.println();
		} else {
			System.out.println("No stuffy exists for id: "+ id);
		}
		return s;
	}
	
	private static void byeBye() {
		
		System.out.println();
		System.out.println("      8-BIT BYE BYE ");
		System.out.println();
		System.out.println("        GAME OVER ");
		System.out.println();
		System.out.println("      ##          ##");      
		System.out.println("        ##      ##");       
		System.out.println("     ##############");
		System.out.println("   ####  ######  ####");
		System.out.println(" ######################");
		System.out.println(" ##  ##############  ##");    
		System.out.println(" ##  ##          ##  ##");
		System.out.println("       ####  ####");
		System.out.println();
		
	}
}
	

