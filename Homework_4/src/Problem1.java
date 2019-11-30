import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		String file = "integerFile.txt";
		generateFileOfInts(file);
		ArrayList<Integer> arr = readFile(file);

		System.out.println(arr);
	
	}
	
	public static void generateFileOfInts(String f) {
		try {
			FileWriter out = new FileWriter(f);
			for (int i = 0; i < 100; i++) {
				out.write((int) (Math.round(Math.random() * 100)) + " ");
			}
			out.close();
			
		} catch (IOException e1) {
			System.out.println("error");
			e1.printStackTrace();
		}
	}
	
	public static ArrayList<Integer> readFile(String f) {
		Scanner fileIn = new Scanner(f);
		ArrayList<Integer> a = new ArrayList<Integer>();
		while (fileIn.hasNextInt()) {
			int i = fileIn.nextInt();
			Integer it = new Integer(i);
			a.add(it);
		}
		fileIn.close();
		return a;
	}
}
