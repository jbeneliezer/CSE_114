import java.util.*;
public class EliminateDuplicates {

	public static void main(String[] args) {
		// initializes objects
		int arr[] = new int[10];
		Scanner stdin = new Scanner(System.in);
		
		// creates array of integers
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = stdin.nextInt();
		}
		
		// eliminates duplicates by calling eliminateDuplicates on arr
		int[] finalArr = eliminateDuplicates(arr);
		
		// prints out final array with duplicates removed
		System.out.print("The distinct numbers are: ");
		for (int i: finalArr) {
			System.out.print(i + " ");
		}
		stdin.close();
	}
	
	// removes duplicates from integer array
	public static int[] eliminateDuplicates(int[] list) {
		int[] newList = new int[10];
		int j = 0;
		int len = list.length;
		
		// removes duplicates, copying array to newList
		for (int i = 0; i < list.length; i++) {
			if (test(Arrays.copyOfRange(list, 0, i), list[i])) {
				len--;
				continue;
			} else {
				newList[j] = list[i];
			}
			j++;
		}
		
		// eliminates extra zeros from newList
		int finalList[] = new int[len];
		for (int i = 0; i < len; i++) {
			finalList[i] = newList[i];
		}
		return finalList;
	}
	
	// checks list for duplicates
	public static boolean test(int[] list, int x) {
		for (int i: list) {
			if (i == x) {
				return true;
			}
		}
		return false;
	}

}
