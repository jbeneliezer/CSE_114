import java.util.Scanner;
public class MeanAndStandardDeviation {

	public static void main(String[] args) {
		double arr[] = new double[10];
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter 10 doubles: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = stdin.nextDouble();
		}
		
		System.out.println("Mean is: " + mean(arr));
		System.out.println("Standard deviation is: " + deviation(arr));
		stdin.close();
	}
	
	public static double deviation(double[] x) {
		double sum = 0;
		for (double i: x) {
			sum += Math.pow((i - mean(x)), 2);
		}
		return Math.sqrt(sum/ 9);
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		for (double i: x) {
			sum += i;
		}
		return sum/ x.length;
	}

}
