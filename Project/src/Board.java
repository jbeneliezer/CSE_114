
public class Board {
	private char[][] arr = new char[6][7];
	private Status status;
	private char disk;
	
	// default board constructor
	public Board() {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				arr[i][j] = ' ';
			}
		}
		status = Status.R_PLAYING;
		disk = 'R';
	}
	
	// returns status
	public Status getStatus() {
		return status;
	}
	
	// prints out board
	public void printBoard() {
		for (char[] i: arr) {
			System.out.print("|");
			for (char j: i) {
				System.out.print(j + "|");
			}
			System.out.println();
		}
		System.out.println("***************");
	}
	
	// checks column parameter to see if full
	public boolean isColumnFull(int c) {
		if (arr[0][c] == ' ') return false;
		return true;
	}
	
	// checks whole board to see if full
	public boolean isFull() {
		for (char i: arr[0])
			if (i == ' ')
				return false;
		return true;
	}
	
	// checks for four in a row, based on input location parameter, switches between red turn and yellow turn
	public void gameOverCheck(int x, int y) {
		
		int count = 0;
		for (int i = x - 3; i < x + 4; ++i) {
			if (i < 0) continue;
			else if (i > 5) break;
			else if (arr[i][y] == disk) ++count; // increments if disk is correct color
			else count = 0; // resets count for invalid disk color
			if (count == 4) {status = (disk == 'R') ?  Status.R_WIN : Status.Y_WIN; return; } // exits for 4 in a row, changes status to respective winner
		}
		count = 0;
		for (int i = y - 3; i < y + 4; ++i) {
			if (i < 0) continue;
			else if (i > 6) break;
			else if (arr[x][i] == disk) ++count; // increments if disk is correct color
			else count = 0; // resets count for invalid disk color
			if (count == 4) {status = (disk == 'R') ?  Status.R_WIN : Status.Y_WIN; return; } // exits for 4 in a row, changes status to respective winner
		}
		count = 0;
		for (int i = x - 3, j = y - 3; i < x + 4 && j < y + 4; ++i, ++j) {
			if (i < 0 || j < 0) continue;
			if (i > 5 || j > 6) break;
			if (arr[i][j] == disk) ++count; // increments if disk is correct color
			else count = 0; // resets count for invalid disk color
			if (count == 4) {status = (disk == 'R') ?  Status.R_WIN : Status.Y_WIN; return; } // exits for 4 in a row, changes status to respective winner
		}
		count = 0;
		for (int i = x - 3, j = y + 3; i < x + 4 && j > y - 4; ++i, --j) {
			if (i < 0 || j < 0) continue;
			if (i > 5 || j > 6) break;
			if (arr[i][j] == disk) ++count; // increments if disk is correct color
			else count = 0; // resets count for invalid disk color
			if (count == 4) {status = (disk == 'R') ?  Status.R_WIN : Status.Y_WIN; return; } // exits for 4 in a row, changes status to respective winner
		}
		if (status == Status.R_PLAYING) {status = Status.Y_PLAYING; return; }
		if (status == Status.Y_PLAYING) {status = Status.R_PLAYING; return; }
		
	}
	
	// places disk at lowest possible space in specified column
	public void dropDisk(int column) {
		if (status == Status.R_PLAYING) disk = 'R';
		else if (status == Status.Y_PLAYING) disk = 'Y';
		
		int i = 0;
		while (i < arr.length) {
			if (arr[i][column] != ' ') break;
			++i;
		}
		if (i > 0) {
			arr[i - 1][column] = disk;
			gameOverCheck((i - 1), column);
		}
	}
	
}
