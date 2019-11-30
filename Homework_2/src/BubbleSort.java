import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		String[] stringArray = new String[10];
		Scanner stdin = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			stringArray[i] = stdin.nextLine();
		}
		
		bubbleSort(stringArray);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(stringArray[i] + ", ");
		}
		
		stdin.close();
	}
	
	public static void bubbleSort(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
