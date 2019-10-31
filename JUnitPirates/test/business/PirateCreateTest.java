package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateCreateTest {

	@Test
	public void testPirateCreate() {
		Pirate p = new Pirate("Capitan Hook");
		//assert - expected values
		assertEquals("Capitan Hook", p.getName());
		assertEquals(4, p.getLimbsRemaining());
		//fail("Not yet implemented");
		
	}

	
	@Test
	public void testOctoCreate() {
		Pirate p = new Pirate("Octo Pete", 8);
		//assert - expected values
		assertEquals("Octo Pete", p.getName());
		assertEquals(8, p.getLimbsRemaining());
		//fail("Not yet implemented");
		
	}
	
	@Test
	public void testPeglegPirate() {
		Pirate p = new Pirate("Stubby", 3);
		//assert - expected values
		assertEquals("Stubby", p.getName());
		assertEquals(3, p.getLimbsRemaining());
		//fail("Not yet implemented");
		
	}
	
}
