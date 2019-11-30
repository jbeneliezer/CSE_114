import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String str;
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		str = stdin.nextLine();
		
		if (isAPalindrome(str))
			System.out.println(str + " is a palindrome.");
		else
			System.out.println(str + " is not a palindrome");
		
		stdin.close();
	}
	
	public static boolean isAPalindrome(String str) {
		String s = str.replaceAll("\\s",  "").toLowerCase();
		for (int i = 0; i < s.length()/ 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

}
