package business;

public class JUnitTesting {
	
	public int square(int nbr) {
		int sqr = nbr*nbr;
		return sqr;
		
	}
	
	public int countA(String str) {
		
		
		str = str.toLowerCase() + ".";
		String[] strArray = str.split("a");
		return strArray.length-1;
	
		
	}
}
