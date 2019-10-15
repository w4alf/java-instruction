public class ProductDB {

	public Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Product product = new Product();

        // fill the Product object with data
        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            product = new Product(product.getCode(),"Murach's Java Programming",57.50);
        	
        	//product.setDescription("Murach's Java Programming");
            //product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
        	 product = new Product("jsp","Murach's Java Servlets and JSP",57.50);
           // product.setDescription("Murach's Java Servlets and JSP");
            // product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
        	product = new Product("mysql","Murach's MySQL",54.50);
           // product.setDescription("Murach's MySQL");
           // product.setPrice(54.50);
   
		}   else if (productCode.equalsIgnoreCase("angular")) {
				product = new Product("mysql","Angular for Dummies",19.99);
                //product.setDescription("Angular for Dummies");
                //product.setPrice(19.99);
        } else {
            product.setDescription("Unknown");
        }
        return product;
    }
}