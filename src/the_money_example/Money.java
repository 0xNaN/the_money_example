package the_money_example;

public abstract class Money {
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
		return this.amount == money.amount && getClass().equals(money.getClass());
	}

	abstract Money times(int multiplier);

	public String currency() {
		return currency;
	}
}
