package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import business.Product;
import util.Console;

public class ProductApp {

	public static void main(String[] args) {


		Product p1 = new Product("java", "murachs java", 57.50);
		Product p2 = new Product("jsp", "jsp dummy java", 51.50);
		Product p3 = new Product("mysql", "mysql server", 52.50);
		Product p4 = new Product("c#", "c# for dummies", 53.50);
		Product p5 = new Product("andr", "murachs android", 54.50);

		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		
		String code = Console.getString("Enter a code: ");
		
			//retrieve the product that matches the code entered
		Product pdt = null;
		for (Product p: products) {
			if (p.getCode().equalsIgnoreCase(code));
			//that's my product
			pdt = p;
		}
		
		System.out.println("Your product is " + pdt);
		
		
		
		System.out.println("Get Product from map");
		Map<String, Product> productsMap = new HashMap<>();
		
		productsMap.put("java", p1);
		productsMap.put("jsp", p2);
		productsMap.put("mysql", p3);
		productsMap.put("c#", p4);
		productsMap.put("andr", p5);
		
		System.out.println("Product selected" + productsMap.get(code));
	}
	

}
