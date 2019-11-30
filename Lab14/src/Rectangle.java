
public class Rectangle {
	private double height;
	private double width;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return height * width;
	}
	
	public double getPerimeter() {
		return 2 * height + 2 * width;
	}
}
