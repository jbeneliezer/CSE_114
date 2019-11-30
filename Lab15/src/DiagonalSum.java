import java.util.Scanner;
public class DiagonalSum {

	public static void main(String[] args) {
		double [][] matrix = new double[4][4];
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Enter 4 by 4 array row by row:");
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				matrix[i][j] = stdin.nextDouble();  // initializes each element in array to user's input
		
		System.out.println("Sum of elements along major diagonal is: " + sumMajorDiagonal(matrix));
		
		stdin.close();
	}
	
	// returns sum of major diagonal elements
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++)
			sum += m[i][i];  // sums elements along major diagonal
				
		return sum;
	}


}
