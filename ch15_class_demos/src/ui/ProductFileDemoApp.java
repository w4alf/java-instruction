package ui;

import java.io.*;
import java.nio.file.*;

import business.Product;


public class ProductFileDemoApp {

	public static void main(String[] args) throws IOException {

		//establish filePath and 
		
		Path productsPath = Paths.get("products.txt");
				
				if (Files.notExists(productsPath)) {
					Files.createFile(productsPath);
				} 
		
		File productsFile = productsPath.toFile();
				
				
		PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(productsFile)));
		
		out.println("java\tMurach's Java Programming\t57.50");
		out.println("mysql\tMurach's mysql\t55.50");
		out.println("andr\tMurach's android\t59.50");
		
		out.close();
		
		
		BufferedReader in = new BufferedReader(new FileReader(productsFile));
		
		String line = in.readLine();
		while (line != null) {
			
			String[] fields = line.split("\t");
			String code = fields[0];
			String desc = fields[1];
			String price = fields[2];
			double priceDbl = Double.parseDouble(price);
			Product p = new Product(code,desc,priceDbl);
			System.out.println(p);
			line = in.readLine();
		}
		
		
		
		in.close();
		
				
		
	}

}
