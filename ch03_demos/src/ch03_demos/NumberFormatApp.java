package ch03_demos;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1=.25;
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		NumberFormat pf = NumberFormat.getPercentInstance();
		
		BigDecimal bd = new BigDecimal("25.5555");
		bd.setScale(2, HALF_UP)
		bd.multiply(".1")
		
		System.out.println(cf.format(d1));
		System.out.println(pf.format(d1));
		
		System.out.println("Bye Bye!");
	}
	

}
