import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		char ch, c;
		String vowels = "aeiou", consonants = "bcdfghjklmnpqrstvwxyz";
		Scanner stdin = new Scanner(System.in);
		
		//takes in input character
		System.out.print("Enter character: ");
		ch = stdin.next().charAt(0);
		
		//create lower case equivalent of character
		c = Character.toLowerCase(ch);
		
		//checks if character is in vowels or consonants or neither, prints the result
		if (vowels.indexOf(c) >= 0)
			System.out.println(ch + " is a vowel");
		else if (consonants.indexOf(c) >= 0)
			System.out.println(ch + " is a consonant");
		else
			System.out.println(ch + " is an invalid input");
		
		stdin.close();
	}

}
