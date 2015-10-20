package the_money_example;

public class Money {
	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	static Money franc(int amount) {
		return new Franc(amount, "CHR");
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && currency().equals(money.currency());
	}

	public Money times(int multiplier) {
		return null;
	}

	public String currency() {
		return currency;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}
