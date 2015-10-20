package the_money_example;

public class Pair {
	private String from;
	private String to;

	public Pair(String from, String to) {
		this.from = from;
		this.to   = to;
	}
	
	public boolean equals(Object that) {
		Pair p = (Pair) that;
		return from.equals(p.from) && to.equals(p.to);
	}

	public int hashCode() {
		return 0;
	}
}
