package ui;

import java.util.ArrayList;
import java.util.List;


import business.User;
import util.Console;

public class PrsConsoleApp {
		
	private static List<User> users = new ArrayList<>();
	
	public static void main(String[] args) {

		System.out.println("Welcome to the PRS Console Application");
		
		//create some instances of users with values
		User user1 = new User(1, "cbravo2004", "sesame1", "Christian", "Bravo", "(859) 525-0184","cbravo2004@yahoo.com", true, true);
		User user2 = new User(2, "Alexboy", "sesame2", "Alex", "Bravo", "(859) 525-0184","alexanderb@yahoo.com", true, false);
		User user3 = new User(3, "numchucks", "sesame3", "Bruce", "Lee", "(859) 525-5555","brucel@aol.com", false, false);
		User user4 = new User(4, "scrumbag", "sesame4", "Blake", "Maislan", "(513) 444-4444","scrumbag@yahoo.com", false, false);
		User user5 = new User(5, "redrum", "sesame5", "Danny", "Torrance", "(404) 313-3255","drsleep@gmail.com", false, false);
		
		
		//populate ArrayList of type User class
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		

		
		
		String cmd = "";
		
		//main while loop that checks  for commands entered
		while (cmd !="exit") {
			
			
			//Method will display PRS Command Menu
			getMenu();
			
			cmd = Console.getString("Enter a Command: ");
			
			//business logic for each selection of Command Menu
			
			if (cmd.equalsIgnoreCase("exit")) {
				//End loop and program
				break;
				
			} else if (cmd.equalsIgnoreCase("list")) {
				
				//list all users
				for (int i=0; i < (users.size()); i++) {
					System.out.println();
					System.out.println(users.get(i));
				}
				System.out.println();
				
			} else if (cmd.equalsIgnoreCase("get")) {
				
				//get a user
				
					
					//use method to fetch user by user name
					User userMatch = fetchUser();
				
				
					if (userMatch==null) {
						System.out.println();
						System.out.println("No such user name found. please try again.");
					} else {
			
						System.out.println();
						System.out.println("User found: "+ userMatch);
					}
					
					
			} else if(cmd.equalsIgnoreCase("add")) {
			
				// add a user
				String userName = Console.getString("Enter Username: ");
				String password = Console.getString("Enter Password: ");
				String firstName = Console.getString("Enter First Name: ");
				String lastName = Console.getString("Enter Last Name: ");
				String phoneNumber = Console.getString("Enter Phone Number: ");
				String email = Console.getEmail("Enter Email: ");
				String isReviewer = Console.getYesOrNo("Enter y/n if they are a Reviewer: ");
				String isAdmin = Console.getYesOrNo("Enter y/n if they are an Admin: ");
				
				//set the new userId that does not duplicate any existing key to maintain uniqueness
				int maxUserId = -1;
				int userId = 0;
				
				//ensure userId is unique and one higher than next existing highest id 
				for (User u: users) {
					userId = u.getUserId();
					if (userId > maxUserId) {
						maxUserId = userId;
					}
					
					
				}
								
				maxUserId += 1;
				
				boolean isReviewerBoolean = false;
				boolean isAdminBoolean = false;
				
				//check and set booleans
				if (isReviewer.equalsIgnoreCase("y")) {
					isReviewerBoolean = true;
				} 
				
				if (isAdmin.equalsIgnoreCase("y")) {
					isAdminBoolean = true;
				} 
				
				
				User newUser = new User(maxUserId, userName, password, firstName, lastName, phoneNumber,email, isReviewerBoolean, isAdminBoolean);
				users.add(newUser);
				
				System.out.println();
				System.out.println("User Added.");
				System.out.println();
				
			} else if(cmd.equalsIgnoreCase("edit")) {
				
				//edit only the email field of a user per authentic Sean blessing instructions
				
	
				//use method to fetch user by user name
				User userMatch = fetchUser();
			
						
				if (userMatch==null) {
					System.out.println();
					System.out.println("No such user name found. please try again.");
					
				} else {
		
					System.out.println();
					System.out.println("User email: "+ userMatch.getEmail());
					
					String email = Console.getEmail("Enter new email address: ");
					
					userMatch.setEmail(email);
					
					System.out.println();
					System.out.println("Email has been updated.");
					System.out.println();
					
				}
				
			} else if(cmd.equalsIgnoreCase("delete")|| cmd.equalsIgnoreCase("del")) {
				
				//delete a user
				//prompt in console for a User name
				String uName = Console.getString("To find the user to delete, please enter the Username: ");
				
				int index = -1;
				
				for (User u: users) {
					if (u.getUserName().equalsIgnoreCase(uName)) {
						index = users.indexOf(u);
					}
				}
				
							
				if (index == -1) {
					System.out.println();
					System.out.println("No such user name found. please try again.");
					
				} else {
		
					//remove the user from the ArrayList<>
					users.remove(index);
						
					System.out.println();
					System.out.println("User has been Deleted.");
					System.out.println();

				}
				
				
			
				
			} else {
			
				
				System.out.println("Invalid Command. Please try Again.");
				
			}
			
		}
		
		
		System.out.println();
		System.out.println("Goodbye, Please come again!");
		

		
		
		
	}
	
	
	
	public static void getMenu() {
		
		System.out.println();
		System.out.println("PRS CONSOLE COMMAND MENU");
		System.out.println("list - list all users");
		System.out.println("get - get a user");
		System.out.println("add - add a user");
		System.out.println("edit - edit a user");
		System.out.println("delete - delete a user");
		System.out.println("exit - exit program");
		System.out.println();
	}
	
	public static User fetchUser() {
		
		String uName = Console.getString("Enter Username: ");
		
		
		
		User userMatch = null;
		
		for (User u: users) {
			if (u.getUserName().equalsIgnoreCase(uName)) {
				userMatch = u;
			}
		}
		
		return userMatch;
		
	}

	

} /* PRS Console App Class */
