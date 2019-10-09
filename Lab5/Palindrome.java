import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int n, temp_n, reversed_n = 0;
		Scanner input = new Scanner(System.in);
		
		//takes in integer input and sets it equal to n and temp_n
		System.out.print("Enter 3 digit integer: ");
		n = temp_n = input.nextInt();
		
		//computes the reverse on n
		while (temp_n > 0) {
			reversed_n = reversed_n * 10 + temp_n % 10;
			temp_n /= 10;
		}
		
		System.out.println( n + ((n == reversed_n) ? " is a palindrome": " is not a palindrome"));
		
		input.close();
	}

}
