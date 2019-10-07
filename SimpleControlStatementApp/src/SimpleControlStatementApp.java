
public class SimpleControlStatementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 10;
		int c = 5;
		
		if (a<b) {
			System.out.println("a less than b");
		}
		if (a==b) {
			System.out.println("a equals b");
		}
		String s1 = "abc";
		String s2 = "abc";
		
		// SHOULD NOT EVALUATE TO TRUE BELOW IS THE RIGHT WAY TO COMPARE STRINGS
		if (s1 == s2) {
			System.out.println("a equals b");
		}
		
		if (s1.equals(s2) ) {
			System.out.println("a equals b");
		}
		
		
	}

}
