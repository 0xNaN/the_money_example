package the_money_example;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrancTest {

	@Test
	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}

}
