package ch07_class_demo;

public class InstanceCreatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		car1.setId(10);
		System.out.println(car1.toString());
		System.out.println(Car.NUM_WHEELS);
		System.out.println(Car.objectCount);
		
		Car car2 = new Car(20);
		System.out.println(car2.toString());
		
		Product p1 = new Product();
		p1.setCode("java");
		p1.setDescription("Murach's Java");
		p1.setPrice(57.50);
		
		System.out.println(p1.toString());
		
		// it is implicitly called
		System.out.println(p1);
		
		Truck t1 = new Truck();
		t1.setId(11);
		
		
	}

	
	private static void increasePrice(Product p) {
		double price = p.getPrice()*1.1;
		p.setPrice(price);
	}
	
}
