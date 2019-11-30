
public class RegularPolygon {
	private int n;
	private double side, x, y;
	
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = y = 0;
	}
	
	public RegularPolygon(int num, double s) {
		n = num;
		side = s;
	}
	
	public RegularPolygon(int num, double s, double a, double b) {
		n = num;
		side = s;
		x = a;
		y = b;
	}
	
	public int getN() {
		return n;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setN(int num) {
		n = num;
	}
	
	public void setSide(double s) {
		side = s;
	}
	
	public void setX(double a) {
		x = a;
	}
	
	public void setY(double b) {
		y = b;
	}
	
	public double getPerimeter() {
		return n * side;
	}
	
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/n));
	}
}
