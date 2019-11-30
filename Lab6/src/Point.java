import java.util.Scanner;
public class Point {

	public static void main(String[] args) {
		double x, y;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		x = input.nextDouble();
		System.out.print("Enter y: ");
		y = input.nextDouble();
		
		//compute distance to the origin and compare to circle radius
		if (Math.sqrt(Math.pow(x,  2) + Math.pow(y,  2)) <= 10)
			System.out.println("Point is in the circle");
		else
			System.out.println("Point is not in the circle");
		
		input.close();
	}

}
