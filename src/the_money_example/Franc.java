package the_money_example;

public class Franc extends Money {

	private String currency;
	
	public Franc(int amount) {
		this.amount = amount;
		this.currency = "CHR";
	}

	public Money times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public String currency() {
		return this.currency;
	}
}
