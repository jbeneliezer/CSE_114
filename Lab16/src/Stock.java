
public class Stock {
	private String symbol, name;
	private double previousClosingPrice, currentPrice;
	
	public Stock(String s, String n, double p, double c) {
		symbol = s;
		name = n;
		previousClosingPrice = p;
		currentPrice = c;
	}
	
	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
}
