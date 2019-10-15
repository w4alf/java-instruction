
public class EqualsDemo {

	public EqualsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book("java", "murachs java",59.50,"joel Murach");
		Book b2 = new Book("java", "murachs java",59.50,"joel Murach");
		
		
		
		if (b1==b2) {
			System.out.println("b1 and b2 are the same object");
		}else if (b1.equals(b2)) {
			System.out.println("b1 and b2 are same values");
		}
		else {
			
		}
		
	}

}
