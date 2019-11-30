import java.util.Scanner;
public class TestQuadraticEquation {

	public static void main(String[] args) {
		double a, b, c;
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter a, b, and c: ");
		a = stdin.nextDouble();
		b = stdin.nextDouble();
		c = stdin.nextDouble();

		QuadraticEquation Q = new QuadraticEquation(a, b, c);
		
		if (Q.getDiscriminant() > 0) {
			System.out.println("Root 1: " + Q.getRoot1());
			System.out.println("Root 2: " + Q.getRoot2());
		} else if (Q.getDiscriminant() == 0) {
			System.out.println("Root = " + Q.getRoot1());
		} else
			System.out.println("The equation has no real roots");
		
		stdin.close();
	}

}
