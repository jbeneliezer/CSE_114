
public class LicensePlate {
	

	public static void main(String[] args) {
		String letters = "";
		String numbers = "";
		
		// generates random string of 3 capital letters
		for (int i = 0; i < 3; i++) {
			letters += (char)('A' + Math.random() * ('Z' - 'A' + 1));
		}
		
		// generates random string of 4 integers
		for (int i = 0; i < 4; i++) {
			numbers += Integer.toString((int) (Math.random() * 10));
		}
		
		// makes license plate number from letters and numbers
		String licensePlate = letters + numbers;

		System.out.println("New license plate: " + licensePlate);
	}

}
