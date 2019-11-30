
public class Complex {
	private double n[] = new double[2];
	public Complex() {
		this.n[0] = 0;
		this.n[1] = 0;
	}
	public Complex(double a, double b) {
		this.n[0] = a;
		this.n[1] = b;
	}
	public void displayN() {
		System.out.format("(%.1f, %.1f)\n", this.n[0], this.n[1]);
	}
	public static Complex add(Complex a, Complex b) {
		Complex c = new Complex();
		c.n[0] = a.n[0] + b.n[0];
		c.n[1] = a.n[1] + b.n[1];
		return c;
	}
	public static Complex subtract(Complex a, Complex b) {
		Complex c = new Complex();
		c.n[0] = a.n[0] - b.n[0];
		c.n[1] = a.n[1] - b.n[1];
		return c;
	}
}


