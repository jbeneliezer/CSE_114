import java.util.Scanner;
public class OrderedCities {

	public static void main(String[] args) {
		String city1, city2, city3, ordered = "";
		Scanner stdin = new Scanner(System.in);
		
		// takes in input of three cities
		System.out.print("Enter city 1: ");
		city1 = stdin.nextLine();
		System.out.print("Enter city 2: ");
		city2 = stdin.nextLine();
		System.out.print("Enter city 3: ");
		city3 = stdin.nextLine();
		
		// finds alphabetical order of cities
		if (city1.compareTo(city2) < 0) {
			if (city1.compareTo(city3) < 0) {
				ordered += city1;
				if (city2.compareTo(city3) < 0) {
					ordered += ", " + city2 + ", " + city3;
				} else {
					ordered += ", " + city3 + ", " + city2;
				}
			} else {
				ordered += city3 + ", " + city1 + ", " + city2;
			}
		} else {
			if (city2.compareTo(city3) < 0) {
				ordered += city2;
				if (city1.compareTo(city3) < 0) {
					ordered += ", " + city1 + ", " + city3;
				} else {
					ordered += ", " + city3 + ", " + city1;
				}
			} else {
				ordered += city3 + ", " + city2 + ", " + city1;
			}
			
		}
		
		System.out.println("The three cities in order are: " + ordered);
		
		stdin.close();
	}	

}
