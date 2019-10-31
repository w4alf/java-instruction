package ui;

import java.time.LocalDate;
import java.util.List;

import business.Actor;
import business.ActorDB;
import business.Movie;
import business.MovieDB;
import util.Console;

public class BMDBConsoleApp {

	private static MovieDB movieDB = new MovieDB();
	private static ActorDB actorDB = new ActorDB();
	
	public static void main(String[] args) {

		
		
		System.out.println("Welcome to the BMDB Console App");

		
		int choice = 0;
		
		while(choice != 99) {
			choice = Console.getInt(getMenu(),0,100);
			switch (choice) {
				
			
				case 1:
					//list movie
					List<Movie> movies = movieDB.list();
					System.out.println("List of Movies");
					for (Movie m: movies) {
						System.out.println();
						System.out.println(m);
					}
					
					break;
				case 2:
					//list actors
					
					List<Actor> actors = actorDB.list();
					System.out.println("List of Actors");
					for (Actor a: actors) {
						System.out.println();
						System.out.println(a);
					}
					
					break;
					
				case 3:
					//add movie
					System.out.println("Add a Movie");
					String t = Console.getString("Title?:");
					int y = Console.getInt("Year?:");
					String r = Console.getString("Rating?:");
					String d = Console.getString("Director?:");
					
					Movie m = new Movie(t,y,r,d);
					
					int rc = movieDB.add(m);
					
					if (rc==1) {
						System.out.println("Movie added successfully.");
					} else {
						System.out.println("ERROR ADDING MOVIE. CHECK LOGS");
					}
					
					
					
					break;
				case 4:
					//update movie
					 m = getMovie();
					 if(m!=null) {
						 int year = Console.getInt("New Year?: ");
						 m.setYear(year);
						 rc  = movieDB.update(m);
						 if (rc==1) {
							 System.out.println("Movie updated successfully");
						 } else {
							 System.out.println("Error updating movie year.");
						 }
						 
					 } else {
						 System.out.println("Error ... movie ID doesn't exist.");
					 }
					
					
					break;
				case 5:
					//delete movie
					 m = getMovie();
					 if(m!=null) {
						
						 
						 rc  = movieDB.delete(m);
						 if (rc==1) {
							 System.out.println("Movie deleted successfully");
						 } else {
							 System.out.println("Error deleting movie year.");
						 }
						 
					 } else {
						 System.out.println("Error ... movie ID doesn't exist.");
					 }
					
					break;
				case 6:
					// get a  movie
					 m = getMovie();
					 if(m!=null) {
						 System.out.println("Movie found:");
						 System.out.println(m);
						 
					 } else {
						 System.out.println("Error no movie found with that ID.");
					 }
					break;
					
				case 7:
					// add actor
					
					System.out.println("Add an Actor");
					String fname = Console.getString("First Name?:");
					String lname = Console.getString("Last Name?:");
					String gender = Console.getString("Gender?:");
					String bday = Console.getString("birthday? [yyyy-mm-dd]:");
					LocalDate ldbday = LocalDate.parse(bday);
					
					

					Actor a = new Actor(fname,lname,gender,ldbday);
					
					rc = actorDB.add(a);
					
					if (rc==1) {
						System.out.println("Actor added successfully.");
					} else {
						System.out.println("ERROR ADDING ACTOR. CHECK LOGS");
					}
					 
					break;
					
				case 8:
					// update actor
					 a = getActor();
					 if(a!=null) {
						 fname = Console.getString("New Actor First Name?: ");
						 a.setFirstName(fname);
						 rc  = actorDB.update(a);
						 if (rc==1) {
							 System.out.println("Actor first name updated successfully");
						 } else {
							 System.out.println("Error updating Actor first name.");
						 }
						 
					 } else {
						 System.out.println("Error ... Actor ID doesn't exist.");
					 }
					
					 
					break;
				case 9:
					// delete actor
					 a = getActor();
					
					 if(a!=null) {
						 
						 
						 rc  = actorDB.delete(a);
						 if (rc==1) {
							 System.out.println("Actor deleted successfully");
						 } else {
							 System.out.println("Error deleting Actor.");
						 }
						 
					 } else {
						 System.out.println("Error ... Actor ID not found.");
					 }
					
					
					break;
				case 10:
					//get actor
					 a = getActor();
					 if(a!=null) {
						 System.out.println("Actor:");
						 System.out.println(a);
						 
					 } else {
						 System.out.println("Error Actor ID not found.");
					 }
					
					break;
					
				case 99:

					 
					break;
				default:
					System.out.println("Invalid Command");
					break;
			}
		}
		
		byeBye();
		
	}

	
	private static String getMenu() {
		String menu = "\nCOMMAND MENU:\n" +
					  "1  -  List Movies\n" +
					  "2  -  List Actors \n" +
					  "3  -  Add Movie \n" +
					  "4  -  Update Movie \n" +
					  "5  -  Delete  Movie \n" +
					  "6  -  Get Movie \n" +
					  "7  -  Add Actor \n" +
					  "8  -  Update Actor \n" +
					  "9  -  Delete Actor \n" +
					  "10 -  Get Actor \n" +
					  "99 -  Exit \n" +
					  "Command: ";
		return menu;
	}
	
	private static Movie getMovie() {
		int id = Console.getInt(" Movie id?: ", 0, Integer.MAX_VALUE);
		Movie m = movieDB.get(id);
		return m;
		
	}

	private static Actor getActor() {
		int id = Console.getInt("Actor id?: ", 0, Integer.MAX_VALUE);
		Actor a = actorDB.get(id);
		return a;
		
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
