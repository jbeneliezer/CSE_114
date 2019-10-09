import java.util.Scanner;
public class ShippingWeight {

	public static void main(String[] args) {
		double weight, cost = 0;
		Scanner input = new Scanner(System.in);
		
		//takes in weight from the keyboard
		System.out.print("Enter weight of package: ");
		weight = input.nextDouble();
		
		//computes cost based on weight category
		if (weight > 0 && weight <= 1)
			cost = 3.5;
		else if (weight > 1 && weight <= 3)
			cost = 5.5;
		else if (weight > 3 && weight <= 10)
			cost = 8.5;
		else if (weight > 10 && weight <= 20)
			cost = 10.5;
		else if (weight > 20)
			System.out.println("The package cannot be shipped.");
		else
			System.out.println("Invalid input");
		
		//prints out cost
		if (cost != 0)
			System.out.println("Cost is " + cost);
		
		input.close();
	}

}
