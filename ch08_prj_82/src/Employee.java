
public class Employee extends Person {
	private String ssn="";
	
	public Employee(String first, String last, String ssn) {
		super(first, last);
		this.ssn = ssn;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Name:  " + super.getFirst() + " " + super.getLast() + " \n" 
	         + "SSN:   " + ssn.substring(7);
						
	}
	
	
}	
	
