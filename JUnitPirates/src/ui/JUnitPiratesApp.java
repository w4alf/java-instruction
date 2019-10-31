package ui;

import java.util.ArrayList;
import java.util.List;

import business.Pirate;

public class JUnitPiratesApp {

	

	public static void main(String[] args) {

System.out.println("welcome to the JUnit Pirates app");
	
	List<Pirate> pirates = new ArrayList<>();
	
	Pirate p1 = new Pirate("Jack Sparrow");
	Pirate p2 = new Pirate("Black Beard");
	Pirate p3 = new Pirate("Hector Barbossa");
	Pirate p4 = new Pirate("Stubby", 3);
	
	pirates.add(p1);
	pirates.add(p2);
	pirates.add(p3);
	pirates.add(p4);
	
	
	printPirateSummary(pirates);
	
	
	System.out.println("Pirate fight!");
	
	p2.loseALimb();
	p4.loseALimb();
	p2.loseALimb();
	p2.loseALimb();
	p2.loseALimb();
	p2.loseALimb();
	

System.out.println("bye");
	}
	
	private static void printPirateSummary(List<Pirate> pirates) {
		System.out.println("Pirates: ");
		pirates.parallelStream().forEach(p -> System.out.println(p.toString()));
		System.out.println("Total Pirates: " + Pirate.getNumPirates());
		System.out.println("Total limbs lost: "+ Pirate.getTotalLimbsLost() );
	}

}
