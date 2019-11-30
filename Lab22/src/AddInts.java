import java.util.InputMismatchException;
import java.util.Scanner;
public class AddInts {
	
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner stdin = new Scanner(System.in);
		
		try {
			System.out.print("Enter first integer: ");
			a = stdin.nextInt();
			System.out.print("Enter second integer: ");
			b = stdin.nextInt();
			System.out.println("Sum: " + (a + b));
		} catch (InputMismatchException e) {
			System.out.println("Invalid input, must be integer");
			main(args);
		}
		
		stdin.close();
		
	}

}
