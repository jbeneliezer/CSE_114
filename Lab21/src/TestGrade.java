import java.util.ArrayList;
public class TestGrade {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i = 0; i < 20; i++) {
			nums.add(new Integer((int) (Math.random() * 100)));
		}
		
		ArrayList<Character> chars = grade(nums);
		
		for (int i = 0; i < nums.size(); i++) System.out.println(nums.get(i) + "\t" + chars.get(i));
	}
	
	
	/* A if 90 or above, F if less than 60
	For other letter grades: 80 𝑡𝑜 89 −> 𝐵, 70 𝑡𝑜 79 −> 𝐶, 60 𝑡𝑜 69 −> 𝐷  */
	
	public static ArrayList<Character> grade(ArrayList<Integer> a) {
		ArrayList<Character> ret = new ArrayList<Character>(a.size());
		for (Integer i: a) {
			if (i > 89) ret.add('A');
			else if (i > 79) ret.add('B');
			else if (i > 69) ret.add('C');
			else if (i > 59) ret.add('D');
			else ret.add('F');
		}
		return ret;
	}

}
