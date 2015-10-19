package the_money_example;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
}
