
public class Location {
	private int row, column;
	private double maxValue;
	public Location() {}
	public double getMaxValue() { return this.maxValue; }
	public int getRow() { return this.row; }
	public int getColumn() { return this.column; }
	public static Location locateLargest(double[][] a) {
		Location l = new Location();
		l.maxValue = -999;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > l.maxValue) {
					l.maxValue = a[i][j];
					l.row = i;
					l.column = j;
				}
			}
		}
		return l;
	}
}
