import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = stdin.nextInt();
		}
		
		arr = reverse(arr);
		
		System.out.print("Reversed array: ");
		for (int i = 0; i < 10; i++) {
			System.out.print((arr)[i] + " ");
		}
		stdin.close();
	}
	
	public static void swap(int a[], int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
	public static int[] reverse(int[] a) {
		for (int i = 0; i < a.length/ 2; i++) {
			swap(a, i, a.length - 1 - i);
		}
		return a;
	}
}
