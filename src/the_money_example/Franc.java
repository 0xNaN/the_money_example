package the_money_example;

public class Franc {

	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Franc dollar = (Franc) object;
		return this.amount == dollar.amount;
	}

}
