import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + i + ": ");
			arr.add(stdin.nextInt());
		}
		
		sort(arr);
		System.out.println(arr);
		stdin.close();
	}
	
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
		
	}
}
