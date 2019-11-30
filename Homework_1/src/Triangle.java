import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		double side_1, side_2, side_3, side_max, perimeter = 0;
		boolean valid = false;
		Scanner stdin = new Scanner(System.in);
		
		//takes in lengths of each side
		System.out.print("Enter side 1: ");
		side_1 = stdin.nextDouble();
		System.out.print("Enter side 2: ");
		side_2 = stdin.nextDouble();
		System.out.print("Enter side 3: ");
		side_3 = stdin.nextDouble();
		
		//computes longest side
		side_max = Math.max(side_1, Math.max(side_2, side_3));
		
		//checks for valid triangle
		if (side_max == side_1)
			valid = ((side_2 + side_3) > side_1) ? true: false;
		else if (side_max == side_2)
			valid = ((side_1 + side_3) > side_2) ? true: false;
		else if (side_max == side_3)
			valid = ((side_1 + side_2) > side_3) ? true: false;
		else
			System.out.println("Error, invalid input");
		
		
		
		if (valid) {
			perimeter = side_1 + side_2 + side_3;
			System.out.println("Perimeter: " + perimeter);
		} else {
			System.out.println("Invalid input");
		}
		stdin.close();
	}

}
