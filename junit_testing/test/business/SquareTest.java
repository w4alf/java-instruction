package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testSquare() {
		JUnitTesting testing = new JUnitTesting();
		assertEquals(16,testing.square(4));
		
		
	}

}
