import java.util.Scanner;
public class DecryptMessage {
	
	public static void main(String[] args) {
		String encryptedMessage, message = "";
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter encrypted message: ");
		encryptedMessage = stdin.nextLine();
		
		//decryption algorithm
		for (int i = 0; i < encryptedMessage.length(); i += 2) {
			message += encryptedMessage.charAt(i);
			if (message.length() == 5)
				break;
		}
		
		System.out.println(message);
		stdin.close();
	}
}
