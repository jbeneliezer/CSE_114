package myproject;
public class _Quiz {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		System.out.println(tc.getXY());
		System.out.println(tc.getYX());
	}

}

class TestClass {
	private int x;
	private static int y;
	TestClass() {
		x = 10;
		y = 20;
	}
	public int getXY() {
		return x + y;
	}
	
	public static int getYX() {
		return y + x;
	}
}