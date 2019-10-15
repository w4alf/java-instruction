
public class Customer extends Person {

	String customerNumber ="";
	
	public Customer(String first, String last, String number) {
		super(first, last);
		this.customerNumber = number;
		// TODO Auto-generated constructor stub
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Name:            " + super.getFirst() + " " + super.getLast() + " \n" 
	         + "Customer Number: " + customerNumber +" \n";
						
	}



}
