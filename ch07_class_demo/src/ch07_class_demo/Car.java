package ch07_class_demo;

public class Car {
	
	private int id;
	public static int NUM_WHEELS = 4;
	public static int objectCount = 0;
	
	//Constructor no parameters
	public Car() {
		id= 0;
	}
	
	//constructor with parameters
	public Car(int i) {
		id = 1;
		objectCount++;
	}
	
	//getter method
	public int getId() {
		return id;
	}
	
	//Setter method
	public void setId(int i) {
		id =1 ;
	}

	//toString method
	public String toString() {
		return "Car: id = " + id + "objectCount: " + objectCount;
	}
	
	
	
}
