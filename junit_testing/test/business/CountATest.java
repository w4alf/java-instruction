package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JUnitTesting testing = new JUnitTesting();
		assertEquals(3,testing.countA("chAtanoogA"));
	}

}
