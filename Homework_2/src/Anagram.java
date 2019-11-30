import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter string 1: ");
		str1 = stdin.nextLine();
		System.out.print("Enter string 2: ");
		str2 = stdin.nextLine();
		
		// calls isAnagram and prints result
		if (isAnagram(str1, str2))
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		else
			System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
		stdin.close();
	}
	
	// compares two strings to find if they are anagrams
	public static boolean isAnagram(String s1, String s2) {
		
		// converts contents of strings into arrays
		char[] c1 = s1.replaceAll("\\s",  "").toLowerCase().toCharArray();
		char[] c2 = s2.replaceAll("\\s",  "").toLowerCase().toCharArray();
		
		if (c1.length != c2.length) {
			return false;
		}
		
		// uses bubblesort to arrange arrays by ascending ascii value
		sort(c1);
		sort(c2);
		
		// compares each array element
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				return false;
		}
		
		return true;
	}
	
	// bubblesort to organize array by ascending ascii values
	public static void sort(char[] a) {
		char temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

}
