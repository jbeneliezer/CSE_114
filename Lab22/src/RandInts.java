import java.util.Scanner;
public class RandInts {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) arr[i] = (int)(1 + Math.round(Math.random() * 99));
		
		System.out.print("Enter an array index: ");
		int index = stdin.nextInt();
		
		try {
			System.out.println("value at " + index + ": " + arr[index]);
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
		
		stdin.close();
	}

}
