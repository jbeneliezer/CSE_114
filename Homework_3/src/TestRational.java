import java.util.Scanner;
public class TestRational {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num, den;
		System.out.print("Enter numerator for first rational number: ");
		num = stdin.nextInt();
		System.out.print("Enter denominator for first rational number: ");
		den = stdin.nextInt();
		Rational r1 = new Rational(num, den);
		
		System.out.print("Enter numerator for second rational number: ");
		num = stdin.nextInt();
		System.out.print("Enter denominator for second rational number: ");
		den = stdin.nextInt();
		Rational r2 = new Rational(num, den);
		
		System.out.println("First rational number is: " + r1.makeString());
		System.out.println("Second rational number is: " + r2.makeString());
		
		System.out.println("Addition of the rational numbers is: " + Rational.add(r1, r2).makeString());
		System.out.println("Subtraction of the rational numbers is: " + Rational.subtract(r1, r2).makeString());
		System.out.println("Multiplication of the rational numbers is: " + Rational.multiply(r1,  r2).makeString());
		System.out.println("Division of the rational numbers is: " + Rational.divide(r1,  r2).makeString());
		
		stdin.close();
	}

}
