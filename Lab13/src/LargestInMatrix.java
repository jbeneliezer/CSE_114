import java.util.Scanner;
public class LargestInMatrix {

	public static void main(String[] args) {
		int rows, columns;
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns of the matrix: ");
		rows = stdin.nextInt();
		columns = stdin.nextInt();
		double[][] m = new double[rows][columns];
		
		System.out.print("Enter the matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				m[i][j] = stdin.nextDouble();
			}
		}
		int[] location = locateLargest(m);
	
		System.out.format("The location of the largest element is at (%d, %d)\n", location[0], location[1]);
	}
	
	public static int[]  locateLargest(double[][] a) {
		double largest = a[0][0];
		int[] location = {0, 0};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
					location[0] = i + 1;
					location[1] = j + 1;
				}
			}
		}
		return location;
	}

}
