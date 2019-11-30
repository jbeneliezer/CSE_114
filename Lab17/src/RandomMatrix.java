
public class RandomMatrix {

	public static void main(String[] args) {
		// initialize new random 4 by 4 matrix
		int[][] arr = randomMatrix();
		
		// print out matrix
		for (int[] i: arr) {
			for (int j: i)
				System.out.print(j + " ");
			System.out.println();
		}
		
		// print out largest row and column indexes
		System.out.println("Largest row index: " + largestRowIndex(arr));
		System.out.println("Largest column index: " + largestColumnIndex(arr));
		
	}
	
	// creates new 4 by 4 matrix of random 1's and 0's
	public static int[][] randomMatrix() {
		int[][] a = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = (int) Math.round(Math.random());
			}
		}
		return a;
	}
	
	//iterates over all matrix rows, returning first occurrence of most 1's in a row
	public static int largestRowIndex(int[][] a) {
		int row = -1;
		int largest = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				sum += a[i][j];
			}
			if (sum > largest) {
				largest = sum;
				row = i;
			}
			sum = 0;
		}
		return row;
	}
	
	//iterates over all matrix columns, returning first occurrence of most 1's in a column
	public static int largestColumnIndex(int[][] a) {
		int column = -1;
		int largest = 0;
		int sum = 0;
		for (int j = 0; j < a[0].length; j++) {
			for (int i = 0; i < a.length; i++) {
				sum += a[i][j];
			}
			if (sum > largest) {
				largest = sum;
				column = j;
			}
			sum = 0;
		}
		return column;
	}

}
