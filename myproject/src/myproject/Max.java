package myproject;
import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter string: ");
		String myString = stdin.nextLine();
		int len = myString.length();
		
		for (int i = 0; i < len/2; ++i) {
			if (myString.charAt(i) != myString.charAt(len-1-i)) {
				flag = false;
				break;
			}
		}
		
		System.out.println((flag) ? "string is a palindrome": "string is not a palindrome");
		stdin.close();
	}
}