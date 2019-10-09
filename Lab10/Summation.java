
public class Summation {

	public static void main(String[] args) {
		System.out.println("m\tm(i)");
		
		// call function M for 1 through 20, print the output
		for (int times = 1; times <= 20; times++) {
			System.out.println(times + "\t" + M(times));
		}
		
	}

	public static double M(int n) {
		double m = 0;
		int i = 1;
		
		// summation
		while (i <= n) {
			m += (float) i / (i + 1);
			i++;
		}
		return m;
	}

}
