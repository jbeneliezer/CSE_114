
public class QuadraticEquation {
	private double a, b, c;
	
	public QuadraticEquation(double x, double y, double z) {
		a = x;
		b = y;
		c = z;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getRoot1() {
		if (getDiscriminant() < 0) return 0;
		else return (-b + Math.sqrt(getDiscriminant()))/ (2 * a);
	}
	
	public double getRoot2() {
		if (getDiscriminant() < 0) return 0;
		else return (-b - Math.sqrt(getDiscriminant()))/ (2 * a);
	}
}
