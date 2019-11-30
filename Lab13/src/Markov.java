import java.util.Scanner;
public class Markov {

	public static void main(String[] args) {
		// declare objects
		double[][] a = new double[3][3];
		Scanner stdin = new Scanner(System.in);
		
		// fills matrix with user input
		System.out.println("Enter matrix, row by row:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = stdin.nextDouble();
			}
		}
		
		// check if matrix is markovian, prints the output
		System.out.println((isMarkovMatrix(a)) ? "It is a Markov matrix": "It is not a Markov matrix");
		stdin.close();
	}
	
	public static boolean isMarkovMatrix(double[][] m) {
		double[] columnSum = new double[m.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] < 0) return false;
				columnSum[j] += m[i][j]; 
			}
		}
		for (double i: columnSum) {
			if (Math.abs(i - 1) > 0.00000000001)	return false;
		}
		return true;
	}

}
