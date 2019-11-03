package ui;



import java.util.List;

import business.DndCharacter;
import db.DndDB;
import util.Console;


public class DndCharCreatorApp {
		
	static DndDB characterDb = new DndDB();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Dnd Character App");

		
		
		
		int command = 0;
		
		DndCharacter c = new DndCharacter(); 
		
		
		while (command !=99) {
			
			command = Console.getInt(getMenu(),0, 100);
			
			switch (command) {
			
				case 1:
					//list all characters
					List<DndCharacter> allCharacters = characterDb.getAll();
					
					System.out.println();
					System.out.println("All Dnd Characters:");
					
					for (DndCharacter cList: allCharacters) {
						System.out.println(cList.toString());
					}
					System.out.println();
					break;
	
				case 2:
					//get a character
					int id = Console.getInt("Enter Character Id: ");
					c = getCharacter(id);
					break;
					
				case 3:
					//create a character
					
					
					String dndClass ="";
					
				
					// level starts at 1
					int level = 1;
					
					// Experience Points initialized to 0 - level 2 requires 2000xp
					int expPoints = 0;

					
					int strength = 0;
					int intelligence = 0;
					int wisdom = 0;
					int dexterity = 0;
					int constitution = 0;
					int charisma = 0;
					int goldPieces = 0;
					String armor = "";
					int armorClass = 0;
					int hitPoints = 0;
					
					
					// get name for character from user
					String name = Console.getString("Name: ");
					
							
					
					//3d6 dice roll to determine each
					System.out.println("A 3d6 dice roll was performed for each ability below:");
					System.out.println("");
									
					
					boolean isTrue = false;
					int[] abilities = new int[4];
					
					//This loop ensures that at least one of the core abilities is >= 13 by re-rolling to allow for a dnd class requisite later
					while (!isTrue){
						
						for (int i=0; i< 4;i++) {
								abilities[i] = diceRoll(3,6);
								if (abilities[i] >= 13) {
									isTrue = true;
								}
						}
					}
						
					//assign dice rolls to abilities
					strength = abilities[0];
					intelligence= abilities[1];
					wisdom= abilities[2];
					dexterity= abilities[3];
					constitution= diceRoll(3,6);
					charisma= diceRoll(3,6);
					
					System.out.println("strength: "+ strength);
					System.out.println("intelligence: "+ intelligence);
					System.out.println("wisdom: "+ wisdom);
					System.out.println("dexterity: "+ dexterity);
					System.out.println("constitution: "+ constitution);
					System.out.println("charisma: "+ charisma);
					System.out.println();
					
					
					// Dnd "Class" is set after rules "requisites" of abilities are determined
					//based on your roles you qualify to select from the following classes
					String resultString="";
					
					if (wisdom >= 13) {
						resultString = "Cleric ";
					}
					
					if (strength >= 13) {
						resultString += "Fighter Dwarf ";
					}
					
					if (intelligence >= 13) {
						resultString += "Magic-User ";
					}	
					if (dexterity >= 13) {
						resultString += "Thief ";
					}
					if (intelligence >= 13 && strength >= 13) {
						resultString += "Elf ";
					} 
					if (strength >= 13 && dexterity >= 13) {
						resultString += "Halfling ";
					}

					
					resultString.replace(" ", " |");
					resultString = "| "+ resultString;
					System.out.println("Based on your ability scores you qualify for the following classes:");
					System.out.println(resultString);
					
					isTrue = false;
	
					
					//While loop sets Class selected
					 
					
					while (!isTrue){
						dndClass = Console.getString("Enter your Class Selection: ");
						dndClass.toLowerCase();
						
						switch (dndClass) {
						case "elf":
						case "halfling":
						case "dwarf":
						case "magic-user":
						case "fighter":
						case "thief":
						case "cleric":
							isTrue = true;
							break;
							
						default:
							System.out.println("Invalid Class. Please try again.");
							System.out.println();
							break;
							
						}
					}
					
					
							
					//gold pieces calc is 3d6x10
					goldPieces = diceRoll(3,6)*10;
					System.out.println();
					System.out.println("You have " + goldPieces + " gold pieces.");
					System.out.println();
					
		
									
					// armor selection and associated costs for Cloth /leather/ chain mail / plate armor 
					
					System.out.println("Cloth - 	 [Cost 0   Gold Pieces]");
					System.out.println("Leather - 	 [Cost 20  Gold Pieces]");
					System.out.println("Chain Mail - [Cost 40  Gold Pieces]");
					System.out.println("Plate Mail - [Cost 100 Gold Pieces]");
					System.out.println();
					
					isTrue = false;
					int tempGP = 0;
					
					while (!isTrue) {
						
						tempGP = goldPieces;
						
						armor = Console.getString("Choose one of the above Armor types [GP deducted from your GP total]: ");
						armor.toLowerCase();
						
						//switch for deducting Gold Pieces from total and setting AC aka Armor Class
						switch (armor) {
						
							case "cloth":
								//no GP deducted
								armorClass = 9;
								break;
								
							case "leather":
								tempGP -= 20;
								armorClass = 7;
								break;
								
							case "chain mail":
								tempGP -= 40;
								armorClass = 5;
								break;
							case "plate mail":
								tempGP -= 100;
								armorClass = 3;
								break;
								
							case "":
								System.out.println("Invalid selection please try again.");
								System.out.println();
								break;
								
							default:
								System.out.println("Invalid selection please try again.");
								System.out.println();
								break;
						}		
					
						if (tempGP >= 0) {
							isTrue =true;
						} else {
							System.out.println("Error. You do not have enough gold pieces for that selection. Try again ");
							System.out.println();
						}
						
					}
					
					
					//set GP to amount with deduction for armor purchase
					goldPieces = tempGP;
					
					
					
					
					isTrue = false;
					//While loop sets hit points and enforces minimum dice roll of >=3 
					//hit points calc rules | cleric, elf, halfing -  1d6 | magic-user,thief - 1d4 | fighter, dwarf  - 1d8 | 
					while (!isTrue){

						
						switch (dndClass) {
						case "cleric":
						case "elf":
						case "halfling":
							hitPoints = diceRoll(1,6);
							break;
						
						case "magic-user":
						case "thief":
							hitPoints = diceRoll(1,4);
							break;
							
						case "fighter":
						case "dwarf":
							hitPoints = diceRoll(1,8);
							break;
			
						}
						
						if (armorClass >= 3) {
							isTrue = true;
						}
						
					}
										
							
					c = new DndCharacter(name,dndClass,level,strength,intelligence,wisdom,dexterity,constitution,charisma,goldPieces,expPoints,armorClass,armor,hitPoints);
					
					int rowCount = characterDb.add(c);
					
					System.out.println();
					
					if (rowCount==0) {
						System.out.println("There was an error creating your Character! ");
					} else {
						System.out.println("Success. Your Character was created. ");
					}
					
					
					System.out.println();
					
					
					break;
					
				case 4:

					//edit
					int idEdit = Console.getInt("Enter Character Id to edit: ");
					DndCharacter cEdit = getCharacter(idEdit);
					
		
					if (!(cEdit==null)) {
						
						System.out.println();
						System.out.println("Enter the info below to edit the Character.");
						name = Console.getString("New Name: ");
						cEdit.setName(name);	

						
						rowCount = characterDb.update(cEdit);

						if (rowCount == 0) {
							System.out.println("Error. The character's Name was not edited successfully.");
						} else {
							System.out.println("Success. The Character's name was edited.");
							System.out.println();
						}
					} else {
						
						System.out.println();
						break;
					}
					break;
					
				case 5:
					//delete a character
					System.out.println("place delete a character logic here");
					break;
				case 6:
					//save a character to text file
					System.out.println("place save a character to text file logic here");
					break;
				case 99:
					//exit
					byeBye();
					break;
					
				default:
					System.out.println("Invalid command selection, please try again.");
					break;
				
			} // switch loop end
			
		}	// while loop end

		
		
		
	}// main method end

	
	private static int diceRoll(int nbrOfDice, int nbrOfSides) {
		
		int diceTotal =0;
		
		for (int i =0; i < nbrOfDice;i++) {
			diceTotal += (int) (Math.random() * nbrOfSides) + 1;
		}
		
		return diceTotal;
	}
	
	
	private static String getMenu() {
		String menu = "MAIN MENU:\n" +
					  "1 -   List all Characters \n" +
					  "2 -   Get a Character \n" +
					  "3 -   Create a Character \n" +
					  "4 -   Edit a Character \n" +
					  "5 -   Delete a Character\n" +
					  "6 -   Save a Character to text file\n" +
					  "99 - Exit App\n" +
					  "Command: ";
		return menu;
	}
	
	private static DndCharacter getCharacter(int id) {
		
		DndCharacter c = characterDb.get(id);
		
		if (c!=null) {
			System.out.println();
			System.out.println("DND Character: ");
			System.out.println(c);
			System.out.println();
		} else {
			System.out.println("No character exists for id: "+ id);
		}
		return c;
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
	
} // DndCreatorApp end
