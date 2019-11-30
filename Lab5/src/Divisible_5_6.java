import java.util.Scanner;
public class Divisible_5_6 {

	public static void main(String[] args) {
		int n;
		boolean by_five, by_six;
		Scanner input = new Scanner(System.in);
		
		//takes integer input and sets it equal to n
		System.out.print("Enter integer ");
		n = input.nextInt();
		
		//checks if n is divisible by 5 and by 6
		by_five = (n % 5 == 0) ? true: false;
		by_six = (n % 6 == 0) ? true: false;
		
		System.out.println("Is " + n + " divisible by 5 and 6? " + (by_five && by_six));
		System.out.println("Is " + n + " divisible by 5 or 6? " + (by_five || by_six));
		System.out.println("Is " + n + " divisible by 5 or 6, but not both? " + (by_five ^ by_six));

		input.close();
	}

}
