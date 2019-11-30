import java.util.Scanner;
public class MultiplyMatrices {

	public static void main(String[] args) {
		double m1[][] = new double[3][3];
		double m2[][] = new double[3][3];
		double mMultiplied[][] = new double[m1.length][m2[0].length];
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter matrix 1: ");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m1[i][j] = stdin.nextDouble();
			}
		}
		
		System.out.print("Enter matrix 2: ");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				m2[i][j] = stdin.nextDouble();
			}
		}
		
		mMultiplied = multiplyMatrices(m1, m2);
		
		for (int i = 0; i < mMultiplied.length; i++) {
			for (int j = 0; j < mMultiplied[0].length; j++) {
				System.out.print(mMultiplied[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
		stdin.close();
	}
	
	public static double[][] multiplyMatrices(double[][] a, double[][] b) {
		if (a[0].length != b.length) {
			System.out.println("Error, matrix 1 must have same number of columns as the number of rows in matrix 2");
			return null;
		}
		
		double returnMatrix[][] = new double[a.length][b[0].length];
		
		// initialize matrix with each element = 0;
		for (int i = 0; i < returnMatrix.length; i++) {
			for (int j = 0; j < returnMatrix[0].length; j++) {
				returnMatrix[i][j] = 0;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					returnMatrix[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return returnMatrix;
	}

}
