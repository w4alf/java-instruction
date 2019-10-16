
public class ProductApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book("java", "murachs java", 57.50, "Joel Murach");
		b1.print();
		printIt(b1);
		
		Book b2 = null;
		
		try {
			b2 = (Book) b1.clone();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("b2 contents"+ b2);
		
		
	}
	
	private static void printIt (Printable p) {
		
		
	}
}
