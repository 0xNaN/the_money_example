package the_money_example;

public abstract class Money {
	protected int amount;

	static Money dollar(int amount) {
		return new Dollar(amount);
	}

	static Money franc(int amount) {
		return new Franc(amount);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && getClass().equals(money.getClass());
	}

	abstract Money times(int multiplier);
	abstract String currency();

}
