
/* ---------------IMPORTANT--------------------*
 * This program requires Rectangle.java to work
 * Make sure it is in the same directory before compiling*/

public class TestRectangle {

	public static void main(String[] args) {
		
		// creates two new Rectangle objects with specified widths and heights
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		// prints out width, height, area, and perimeter of each Rectangle object
		System.out.format("Width: %.0f\nHeight: %.0f\nArea: %.0f\nPerimeter: %.0f\n\n", r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());
		System.out.format("Width: %.1f\nHeight: %.1f\nArea: %.2f\nPerimeter: %.1f\n\n", r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
		
	}

}
 