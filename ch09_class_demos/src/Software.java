
public class Software extends Product {

	private String version ="";

	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Software(String code, String description, double price, String version) {
		super(code, description, price);
		this.version = version;
		// TODO Auto-generated constructor stub
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return  super.toString() + "Version: " + version;
	}
	
	
	
	
}
