import java.util.*;
public class MergeArrayList {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("Austin", "Dallas", "San Francisco"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("Boston", "Chicago", "Denver", "Seattle"));
		
		ArrayList<String> a3 = mergeList(l1, l2);
		System.out.println(a3);
		
		stdin.close();
	}
	
	public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
		ArrayList<String> l = new ArrayList<String>();
		for (String i: lst1) l.add(i);
		for (String i: lst2) l.add(i);
		Collections.sort(l);
		
		return l;
	}

}
