package business;
import java.text.NumberFormat;

public class Product implements Cloneable {

    private String code;
    private String description;
    private double price;
    protected static int count = 0;
    

    public Product() {
        code = "";
        description = "";
        price = 0;
    }
    
    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    public String getPriceNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(2);
        number.setMinimumFractionDigits(2);        
        String priceFormatted = number.format(price);
        return priceFormatted;       
    }
    
 

    @Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}

	//compare product.code to compare if two instances are 
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Product ) {
			Product  p2 = (Product) obj;
			if(code.equalsIgnoreCase(p2.getCode())) {
				return true;
			}
			
		}
		return false;
	}
}