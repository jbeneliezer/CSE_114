
public class Rational {
	private int n;
	private int d;
	public Rational() {
		n = 1;
		d = 1;
	}
	public void reduce() {
		for (int i = Math.min(this.n, this.d); i > 1; i--) {
			if (this.n % i == 0 && this.d % i == 0) {
				this.n /= i;
				this.d /= i;
			}
		}
		
	}
	public Rational(int a, int b) {
		n = a;
		d = b;
		reduce();
	}
	
	public static Rational add(Rational a, Rational b) {
		int x1 = a.n * b.d;
		int x2 = b.n * a.d;
		return new Rational(x1 + x2, a.d * b.d);
	}
	public static Rational subtract(Rational a, Rational b) {
		int x1 = a.n * b.d;
		int x2 = b.n * a.d;
		return new Rational(x1 - x2, a.d * b.d);
	}
	public static Rational multiply(Rational a, Rational b) {
		return new Rational(a.n * b.n, a.d * b.d);
	}
	public static Rational divide(Rational a, Rational b) {
		return new Rational(a.n * b.d, a.d * b.n);
	}
	public String makeString() {
		return this.n + "/" + this.d;
	}
}
