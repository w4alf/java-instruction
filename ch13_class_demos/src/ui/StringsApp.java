package ui;

public class StringsApp {

	public static void main(String[] args) {


		String str1 = "Murachs java programming";
		
		if (str1.startsWith("murach")) {
			System.out.println("not case sensitive");
		} else {
			System.out.println("case sensitive");
		}

		
		String str2 = "bob l smith";
		
		System.out.println(str2.length());
		System.out.println(str2.indexOf("b"));
		System.out.println(str2.indexOf("b", 1));
		
		int idx1 = str2.indexOf(" ");
		int idx2 = str2.indexOf(" ", idx1+1);
		System.out.println("first occurence of space at " + idx1);
		System.out.println("second occurence of space at " + idx2);
		
		String fname = str2.substring(0,idx1);
		String mi = str2.substring(idx1+1,idx2);
		String lname = str2.substring(idx2+1);
		
		System.out.println("fname = " + fname);
		System.out.println("mi = " + mi);
		System.out.println("lname = " + lname);
		
		String name2 = "      Sue Johnson    ";
		System.out.println(name2);
		System.out.println(name2.length());
		String name3 = name2.trim();
		System.out.println(name3);
		System.out.println(name3.length());
		
		String name4 = "%%%%%%%%%%%%b%%%%o%%%%%b%%%%";
		String name5 = name4.replace('%',' ');
		System.out.println(name5);
		
		String[] name1Array = str2.split(" ");
		for (String s: name1Array) {
			System.out.println(s);
		}
		
		
		
		
	}
	
}
