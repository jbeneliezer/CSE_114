import java.util.Scanner;
public class TelephoneNumber {

	public static void main(String[] args) {
		String inputNumber, formatNumber;
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter phone number: ");
		inputNumber = stdin.nextLine();
		
		//formats the phone number
		formatNumber = "(" + inputNumber.substring(0, 3) + ")" + inputNumber.substring(3, 6) + "-" + inputNumber.substring(6, 10);
		
		System.out.println(formatNumber);
		stdin.close();
	}

}
