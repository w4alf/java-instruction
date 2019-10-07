import java.util.Scanner;

public class DataTypeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String fName = "Bob";
	String lName = "Smith";
	
	String fullName = fName + " " + lName;
	
	double price = 49.99;
	int div = 5;
	
	String fn1 = "Bob";
	String ln1 = "Marley";
	String name = "";
	
	name += fn1;
	name += " ";
	name += ln1;
	
	int n1 = 5 ;
	System.out.println(n1);
	
	n1 += 10;
	n1 -=2;
	n1 *=2;
	n1 /=5;
	
	
	double d1 = (double) n1/5;
			
	String s1 = " \" This is a para - \n graph. "
			+ "It takes \nup multiple lines, and"
			+ " uses a t\tab";
	System.out.print("a");
	System.out.print("b");
	
	Scanner sc = new Scanner(System.in);
	
	
//	System.out.println("Enter something?:");
//	String scr = sc.nextLine();
//	
//	
//	System.out.println("Enter a double:");
//	double d2 = sc.nextDouble();
//	System.out.println("You Entered: " + d2);
//	
//	System.out.println("Enter an integer:");
//	int i1 = sc.nextInt();
//	System.out.println("You Entered: " + i1);
//	

		
	// System.out.println("You Entered: " + scr);
	
	 // System.out.println(fullName + " " + price);
	
	System.out.println("Enter four words:");
	String s2 = sc.next();
	String s3 = sc.next();
	String s4 = sc.next();
	String s5 = sc.next();
	
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	
	sc.close();
		
	}

}
