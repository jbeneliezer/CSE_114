import java.util.Scanner;
public class FlipInteger {

	public static void main(String[] args) {
		long n, nFlipped = 0;
		
		//creates new scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer to be flipped: ");
		n = input.nextLong();
		
		//flips n using modulo and integer division
		while (n > 0) {
			nFlipped = nFlipped * 10 + (n % 10);
			n /= 10;
		}
		
		//prints nFlipped to the console
		System.out.println(nFlipped);
		input.close();
	}
	
}
