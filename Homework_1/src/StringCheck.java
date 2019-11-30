import java.util.Scanner;
public class StringCheck {

	public static void main(String[] args) {
		int i = 0, vowelCount = 0, consonantCount = 0;
		char c;
		String str = new String("");
		String vowels = new String("aeiou");
		String consonants = new String("bcdfghjklmnpqrstvwxyz");
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		str = stdin.next();
		
		while (i < str.length()) {
			 c = Character.toLowerCase(str.charAt(i));
			 ++i;
			 if (vowels.indexOf(c) >= 0)
				 ++vowelCount;
			 else if (consonants.indexOf(c) >= 0)
				 ++consonantCount;
			 else
				 continue;
		}
		
		System.out.println("The number of vowels is: " + vowelCount);
		System.out.println("The number of consonants is: " + consonantCount);
		
		stdin.close();
	}

}
