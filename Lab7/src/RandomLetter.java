
public class RandomLetter {

	public static void main(String[] args) {
		// creates random capital letter
		char randomCapitalLetter = (char)('A' + Math.random() * ('Z' - 'A' + 1));
		
		System.out.println(randomCapitalLetter);
	}

}
