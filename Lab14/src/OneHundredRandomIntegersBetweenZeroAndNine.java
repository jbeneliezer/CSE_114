
public class OneHundredRandomIntegersBetweenZeroAndNine {

	public static void main(String[] args) {
		
		// generates array of 100 random integers between 0 and 9
		int[] arr = GenerateRandomInts(100);
		
		// counts number of occurrences of each integer in arr
		int[] counts = Counter(arr);
		
		// prints number of occurrences of each integer in arr
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ":  " + counts[i]);
		}
	}
	
	// Generates array of n random integers between 0 and 9
	public static int[] GenerateRandomInts (int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 10);
		}
		return a;
	}
	
	// counts number of occurrences of each integer in array of range 0 - 9
	public static int[] Counter (int[] a) {
		int[] c = new int[10];
		for (int i: a) {
			c[i]++;
		}
		return c;
	}

}  
