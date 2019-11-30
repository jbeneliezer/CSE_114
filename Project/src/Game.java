import java.util.Scanner;
import java.util.InputMismatchException;

public class Game {

	public static void main(String[] args) {
		int column;
		Scanner stdin = new Scanner(System.in);
		
		// initialize new Board object 
		Board b = new Board();
		
		// prints board
		b.printBoard();
		
		// runs until board is full or status is no longer in one of the playing modes
		while (!b.isFull() && b.getStatus() == Status.R_PLAYING || b.getStatus() == Status.Y_PLAYING) {
			
			System.out.print(((b.getStatus() == Status.R_PLAYING) ? "Red " : "Yellow ") + "turn, Enter column (0 - 6): ");
			try {
				column = stdin.nextInt();
				stdin.nextLine(); // clears input buffer
			} catch (InputMismatchException e) {
				System.out.println(stdin.nextLine() + ": invalid type");
				continue;
			}
			
			if (column > 6 || column < 0) { // checks for input out of column range 
				System.out.println("Out of range, try again");
				continue;
			} else if (b.isColumnFull(column)) { // checks for column filled up
				System.out.println("Column is full, try again");
				continue;
			}
			
			// calls dropDisk() to place disk in specified column
			b.dropDisk(column);
			
			// prints updated board
			b.printBoard();
			
		}
		
		stdin.close();
		
		switch(b.getStatus()) {
		case R_WIN:
			System.out.println("Red won.");
			break;
		case Y_WIN:
			System.out.println("Yellow Won.");
			break;
		default:
			System.out.println("Draw.");
			break;
		}

	}

}
