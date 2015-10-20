package the_money_example;

public class Sum implements Expression {
	public Money augend;
	public Money addend;
	
	public Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}
}
