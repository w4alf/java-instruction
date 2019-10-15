package ch07_class_demo;

public class PassByReferenceAndTypeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price = 14.99;
		price = increasePrice(price);
		System.out.println(price);
		
		
	}

	private static double increasePrice(double p) {
		
		p = p*1.1;
		return p;
	}
	
	
	
}
