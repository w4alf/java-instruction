package ui;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import business.Contact;
import business.TestContact;
import util.Console;

public class ContactManagerApp {

	public static void main(String[] args) {

System.out.println("Welcome to the Contact Manager App\n");

		
		int command = 0;
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		while(command != 99) {
			command = Console.getInt(getMenu(),0,100);
			switch (command) {
			
			case 1:
				//list Contact
				for (Contact c: contacts) {
					System.out.println(c);
				}
			
				
				break;
			case 2:
				//list Contact w/ no phone
				System.out.println("list contact no phone");
				List<Contact> contactsWithoutPhone = filterContactWithoutPhone(contacts);
				for (Contact c: contactsWithoutPhone) {
					System.out.println(c);
				}
				
				break;
			case 3:
				//list Contact w/ no email
				
				System.out.println("list contact no email");
				List<Contact> contactsWithoutEmail = filterContactWithoutEmails(contacts);
				for (Contact c: contactsWithoutEmail) {
					System.out.println(c);
				}
				break;
			case 4:
				//lambda: list Contact w/ no phone
				System.out.println("lambda: list contact no phone");
				contactsWithoutPhone = filterContacts(contacts, c -> c.getPhone() ==null);
				for (Contact c: contactsWithoutPhone) {
					System.out.println(c);
				}
					
				break;
			case 5:
				//lambda: list Contact w/ no phone
				System.out.println("lambda: list contact no email");
				contactsWithoutEmail = filterContacts(contacts, c -> c.getEmail() ==null);
				for (Contact c: contactsWithoutEmail) {
					System.out.println(c);
				}
					
				break;
			case 6:
				//lambda:  list Contact w/ Mike Murach
				System.out.println("lambda predicate: list contact no phone");
				List<Contact> contactMike = filterContacts(contacts, c -> c.getName().equals("Mike Murach"));
				for (Contact c: contactMike) {
					System.out.println(c);
				}
					
				break;	
				
			case 7:

				
				//lambda predicate: list Contact w/ no phone
				System.out.println("lambda: list contact no email");
				contactsWithoutPhone = filterContacts2(contacts, c -> c.getPhone()==null);
				for (Contact c: contactsWithoutPhone) {
					System.out.println(c);
				}
					
				break;	
			
			case 8:

				
				System.out.println("lambda Consumer: print name");
				processContacts(contacts, c -> System.out.println(c.getName()));
								
				break;
				
			case 9:
				System.out.println("Streams - list names for each contact missing phone.");
				contacts.stream().filter(c -> c.getPhone()==null).forEach(c -> System.out.println(c.getName()));
					break;
			case 10:
				System.out.println("Map and reduce contacts to single string.");
				String csv = contacts.stream().map(c -> c.getName()).reduce("",(a,b)-> a+b+", ");
			
				csv = csv.substring(0,csv.length()-2);
				System.out.println("All contacts"+csv);
					break;
			case 99:
				//exit
				System.out.println("exit");

				
				break;
			default:
				System.out.println("Invalid Command: " + command);
				break;
			
			
			}
		}
		
	byeBye();	
		
	}
	
	private static String getMenu() {
		String menu = "\nCOMMAND MENU:\n" +
					  "1  -  List Contacts\n" +
					  "2  -  List Contacts w/ no phone \n" +
					  "3  -  List Contact w/ email \n" +
					  "4  -  Lambda: List Contacts w/ no phone \n" +
					  "5  -  Lambda: List Contact w/ email \n" +
					  "6  -  Lambda: List Contact w/ Mike murach \n" +
					  "7  -  Lambda Predicate: List Contact w/ no phone \n" +
					  "8  -  Lambda Consumer: Print names\n" +
					  "9  -  Lambda Consumer: Print names\n" +
					  "10  -  map and reduce strings to a single string\n" +
					  "99  - Exit \n" +
					  "Command: ";
		return menu;
	}

	
	public static List<Contact> filterContactWithoutPhone(List<Contact> contacts) {
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if(c.getPhone()==null) {
				contactsWithoutPhone.add(c);
			}
		}
		
		return contactsWithoutPhone;
		
	}
	
	
	public static List<Contact> filterContactWithoutEmails(List<Contact> contacts) {
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c: contacts) {
			if(c.getEmail()==null) {
				contactsWithoutEmail.add(c);
			}
		}
		
		return contactsWithoutEmail;
		
	}
	
	public static List<Contact> filterContacts(List<Contact> contacts, TestContact condition) {
		
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if(condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		
		return filteredContacts;
		
	}


	public static List<Contact> filterContacts2(List<Contact> contacts, Predicate<Contact> condition) {
		
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if(condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		
		return filteredContacts;
		
	}
	
	public static void processContacts(List<Contact>contacts, Consumer<Contact> consumer) {
		for (Contact c: contacts) {
			consumer.accept(c);
		}
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
