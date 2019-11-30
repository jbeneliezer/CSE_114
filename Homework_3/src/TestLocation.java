import java.util.Scanner;
public class TestLocation {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns: ");
		double[][] arr = new double[stdin.nextInt()][stdin.nextInt()];
		
		System.out.println("Enter the array:");
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[0].length; j++)
				arr[i][j] = stdin.nextDouble();
		

		Location l = Location.locateLargest(arr);
		System.out.format("The largest element %f is at (%d, %d)\n", l.getMaxValue(), l.getRow(), l.getColumn());
		
		stdin.close();
	}

}
