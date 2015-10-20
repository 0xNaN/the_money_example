package the_money_example;

public class Franc extends Money {

	public Franc(int amount) {
		this.amount = amount;
	}

	public Money times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public String currency() {
		return "CHR";
	}
}
