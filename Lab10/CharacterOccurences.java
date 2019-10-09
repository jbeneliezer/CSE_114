import java.util.Scanner;
public class CharacterOccurences {

	public static void main(String[] args) {
		
		// declare objects
		String str;
		char ch;
		int n;
		Scanner stdin = new Scanner(System.in);
		
		// take in parameters
		System.out.print("Enter string: ");
		str = stdin.nextLine();
		System.out.print("Enter character: ");
		ch = stdin.next().charAt(0);
		
		// call Occurrences on parameters, prints the output
		n = Occurrences(str, ch);
		System.out.format("%c occurred in %s %d times", ch, str, n);
		
		stdin.close();
	}
	
	public static int Occurrences(String s, char c) {
		int sum = 0;
		
		// increment sum by one for each occurrence of specified character in string
		for (int i = 0; i < s.length(); i++) {
			sum += (s.charAt(i) == c) ? 1: 0;
		}
		return sum;
	}

}
