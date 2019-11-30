
public class TestStock {

	public static void main(String[] args) {
		Stock s = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		System.out.println("Percent change: " + s.getChangePercent());
	}

}
