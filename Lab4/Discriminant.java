import java.util.Scanner;
public class Discriminant {

	public static void main(String[] args) {
		double a, b, c, discriminant, root1, root2;
		
		Scanner input = new Scanner(System.in);
		
		//takes in inputs for a, b, and c from keyboard
		System.out.print("Enter a: ");
		a = input.nextDouble();
		System.out.print("Enter b: ");
		b = input.nextDouble();
		System.out.print("Enter c: ");
		c = input.nextDouble();
		
		//computes the discriminant and prints roots to keyboard
		discriminant = Math.pow(b, 2) - 4 * a * c;
		if (discriminant < 0) {
			System.out.println("No real roots");
		} else if (discriminant == 0) {
			root1 = -b/ (2 * a);
			System.out.println("Equation has one root: " + root1);
		} else {
			root1 = (-b + Math.sqrt(discriminant))/ (2 * a);
			root2 = (-b - Math.sqrt(discriminant))/ (2 * a);
			System.out.println("Equation has two roots: " + root1 + ", " + root2);
		}
		
		input.close();
	}

}
