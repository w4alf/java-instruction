
public class ProductApp {

	public ProductApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Product p1 = new Product("Java","murach's java", 19.95);
		Book b = new Book ("java", "murahcs java", 57.50, "Joel Murach");
		
		Software  s = new Software("netbeans", "NetBeans",0.0,"8.2");

		Product p;
		
		p=b;
		
		
		
		System.out.println("book b = " + b);
		
		System.out.println("software s = " + s);
		
		System.out.println("Product toString: " + p.toString());
		

		System.out.println("Author  " + b.getAuthor());
		
		
		//demonstrate polymorphism
		
	
		
	}

}
