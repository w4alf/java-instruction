
public class AccountBalanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Account Balance Application!\n");
		
		System.out.println("Starting Balances \n");
		
	
			
		CheckingAccount checking = new CheckingAccount(1.0, 1000.00);
		//checking.setBalance(1000.00);
		
		SavingsAccount savings = new SavingsAccount(.012,1000.00);
		
		
		System.out.println(checking.getBalance());
		System.out.println(savings.getBalance());
		
	       
//        // Main loop for continuing
//        String choice = "y";
//        while (choice.equalsIgnoreCase("y")) {
//        
//        	Console console = new Console();	
//        	
//        	   // get the input from the user
//            String firstName = Console.getString(
//                    "Enter First Name: ");
//            contact.setFirstName(firstName);
//        	
//        }
		
		
        //check output for testing 
		//System.out.println("Checking: " + checking.getFee() );
		//System.out.println("Savings: " + savings.getMonIntPymt());
		
	}

}
