package ui;

import java.io.*;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Product;

import util.Console;



public class ProductFileManagerApp {

	private static List<Product> products = new ArrayList<>();
	private static File productsFile;
	
	public static void main(String[] args) throws IOException {


		
		//establish filePath and 
		
		Path productsPath = Paths.get("products.txt");
				
				if (Files.notExists(productsPath)) {
					Files.createFile(productsPath);
				} 
		
		productsFile = productsPath.toFile();
				
				
		
		
		
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
			products.add(p);
			// Save all 
			saveAll();
			
			line = in.readLine();
		}
		
		
		
		in.close();
		
		//Add a new product
		System.out.println("Add a new product:");
		String code = Console.getString("Enter Code:");
		String desc = Console.getString("Enter Description:");
		double price = Console.getDouble("Enter price:");
		
		Product pdt = new Product(code,desc,price);
		products.add(pdt);
		
		System.out.println("New List of Products");
		for (Product p: products) {
			System.out.println(p);
		}

		
		
		//establish our print writer
//		PrintWriter out = new PrintWriter(
//				  new BufferedWriter(
//				  new FileWriter(productsFile)));
//
//		out.println("java\tMurach's Java Programming\t57.50");
//		out.println("mysql\tMurach's mysql\t55.50");
//		out.println("andr\tMurach's android\t59.50");
//
//		out.close();		
		
	} /* main (args) */
	
	private static boolean saveAll() {
		try ( 		PrintWriter out = 	new PrintWriter(
										new BufferedWriter(
										new FileWriter(productsFile)))){
			for (Product p: products) {
				out.print(p.getCode()+"\t");
				out.print(p.getDescription()+"\t");
				out.println(p.getPrice()+"\t");
			}
			return true;
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
			
	}	
	
}

