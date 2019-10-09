import java.util.Scanner;
public class RegularPolygon {

	public static void main(String[] args) {
		int n;
		double length, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of sides: ");
		n = input.nextInt();
		System.out.print("Enter length of each side: ");
		length = input.nextDouble();
		
		//computes the area
		area = (n * Math.pow(length,  2))/ (4 * Math.tan(Math.PI/ (double) n));
		
		System.out.println("Area is: " + area);
		
		input.close();
	}

}
