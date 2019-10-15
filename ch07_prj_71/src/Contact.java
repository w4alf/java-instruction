
public class Contact {

	private String firstName ="";
	private String lastName ="";
	private String email ="";
	private String phoneNumber ="";
	
	
	public Contact() {
		
	}
	
	
	public Contact(String firstName, String lastName, String email, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String displayContact() {
		
		String displayString = 
		
        "-------------------------------------------------------- \n" +
        "------ Current Contact --------------------------------- \n" +
        "-------------------------------------------------------- \n" +
        "Name:          " + this.getFirstName() + " "+ this.getLastName()+ "\n" +
        "Email Address: " + this.getEmail()+ "\n" +
        "Phone Number:  " + this.getPhoneNumber() + "\n"; 
        
        return displayString;
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
