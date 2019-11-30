import java.util.Scanner;
public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		// takes in arguments from keyboard
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = stdin.nextDouble();
		double b = stdin.nextDouble();
		double c = stdin.nextDouble();
		double d = stdin.nextDouble();
		double e = stdin.nextDouble();
		double f = stdin.nextDouble();
		
		// creates new linear equation object with specified parameters
		LinearEquation l = new LinearEquation(a, b, c, d, e, f);
		
		// checks if equation is solvable and prints solution
		if (l.isSolvable()) System.out.println("x is " + l.getX() + " and y is " + l.getY());
		else System.out.println("The equation has no solutions");
		
		stdin.close();
	}

}
