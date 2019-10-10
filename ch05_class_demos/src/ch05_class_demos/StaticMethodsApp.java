package ch05_class_demos;

public class StaticMethodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWelcomeMessage();
		int a = sum(4,5);
		System.out.println("sum is "+ a);
	}
	
	private static void printWelcomeMessage() {
		
		System.out.println("Welcome to my Method!");
	}
	


	private static int sum(int a, int b) {
		
		return  a+b;
	}
	
}