
public class ContactListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// display a welcome message
        System.out.println("Welcome to the Contact List Application");
        System.out.println();

       
        
        // create 1 or more line items
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	
        	 // get the Product object
            Contact contact = new Contact();
        	
        	
            // get the input from the user
            String firstName = Console.getString(
                    "Enter First Name: ");
            contact.setFirstName(firstName);
            
            String lastName = Console.getString(
                    "Enter Last Name: ");
            contact.setLastName(lastName);
            
            
            String email = Console.getString(
                    "Enter Email: ");
            contact.setEmail(email);
            
            
            String phone = Console.getString(
                    "Enter Phone Number: ");
            contact.setPhoneNumber(phone);
            
           //display contact string output
            String display = contact.displayContact();

            System.out.println(display);
            
            
            // see if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();
        }
		
		
		
		System.out.println("BYE BYE");
		
	}

}
