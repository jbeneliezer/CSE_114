
public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	public Triangle() {}
	public Triangle(double a, double b, double c) {
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
	}
	public double getSide1() { return side1; }
	public double getSide2() { return side2; }
	public double getSide3() { return side3; }
	public double getArea() {
		double s = (side1 + side2 + side3)/ 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
	}
	public double getPerimeter() { return side1 + side2 + side3; }
	public String toString() {
		return String.format("Triangle: side1 = %f side2 = %f side3 = %f", side1, side2, side3);
	}
}
