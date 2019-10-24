package business;

public class Vendor {
	
	private int vendorId;			
	private String Code;			
	private String Name;			
	private String Address;       	
	private String City;        	
	private String State; 			
	private String Zip; 			
	private String PhoneNumber; 	
	private String Email;
	
	public Vendor() {
		super();
	
	}

	public Vendor(int vendorId, String code, String name, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		super();
		this.vendorId = vendorId;
		Code = code;
		Name = name;
		Address = address;
		City = city;
		State = state;
		Zip = zip;
		PhoneNumber = phoneNumber;
		Email = email;
	}

	/**
	 * @return the vendorId
	 */
	public int getVendorId() {
		return vendorId;
	}

	/**
	 * @param vendorId the vendorId to set
	 */
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return Code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		Code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return Zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		Zip = zip;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", Code=" + Code + ", Name=" + Name + ", Address=" + Address + ", City="
				+ City + ", State=" + State + ", Zip=" + Zip + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email
				+ "]";
	}

	
}
