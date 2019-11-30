import java.util.Scanner;
public class TestTriangle {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter triangle side1, side2, and side3: ");
		Triangle t = new Triangle(stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble());
		System.out.print("Enter color: ");
		t.setColor(stdin.next());
		System.out.print("Triangle filled? Enter true or false: ");
		t.setFilled(stdin.nextBoolean());
		
		System.out.println("\nArea of Triangle: " + t.getArea());
		System.out.println("Perimeter of Triangle: " + t.getPerimeter());
		System.out.println("Color of Triangle: " + t.getColor());
		System.out.println("Filled? " + t.isFilled());
		
		stdin.close();
	}

}
