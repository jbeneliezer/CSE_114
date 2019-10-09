
public class RandomAverage {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		
		// creates sum of 10 random numbers between 0 and 99
		while (i < 10) {
			sum += (int) (Math.random() * 100);
			i++;
		}
		
		// computes the average
		double average = sum / 10.0;
		
		System.out.println("Average of random numbers is: " + average);

	}

}
