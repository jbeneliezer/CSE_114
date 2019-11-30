import java.util.Scanner;
public class TestComplex {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter real part of first number: ");
		double ar = stdin.nextDouble();
		System.out.print("Enter imaginary part of first number: ");
		double ai = stdin.nextDouble();
		
		System.out.print("Enter real part of first number: ");
		double br = stdin.nextDouble();
		System.out.print("Enter imaginary part of first number: ");
		double bi = stdin.nextDouble();
		
		Complex c = new Complex(ar, ai);
		Complex c2 = new Complex(br, bi);
		c.displayN();
		c2.displayN();
		
		System.out.print("Sum of c and c2 is ");
		(Complex.add(c,  c2)).displayN();
		
		System.out.print("Difference of c and c2 is ");
		(Complex.subtract(c,  c2)).displayN();
		
		stdin.close();
	}
}