import java.util.Scanner;
public class UpperOrLower {

	public static void main(String[] args) {
		int i = 0, numUpperCase = 0;
		char c;
		String str;
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		str = stdin.next();
		
		while (i < str.length()) {
			c = str.charAt(i);
			i++;
			if (Character.isUpperCase(c))
				numUpperCase++;
			else
				continue;
		}
		
		System.out.println("The number of uppercase letters is: " + numUpperCase);
		stdin.close();
	}

}
