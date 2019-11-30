import java.util.Scanner;
import java.util.ArrayList;
public class StringToCharArray {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = stdin.nextLine();
		
		ArrayList<Character> arr = toCharacterArray(str);
		
		for (Character i: arr) System.out.print(i + " ");
		
		stdin.close();
	}
	
	// converts string to ArrayList
	public static ArrayList<Character> toCharacterArray(String s) {
		ArrayList<Character> a = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			a.add(s.charAt(i));
		}
		return a;
	}

}
