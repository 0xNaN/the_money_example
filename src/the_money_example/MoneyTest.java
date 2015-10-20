package the_money_example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(5).currency());
		assertEquals("CHF", Money.franc(5).currency());
	}
	
	@Test
	public void testAddition() {
		Money sum = Money.dollar(5).plus(Money.dollar(5));
		assertEquals(Money.dollar(10), sum);
	}
}
