import java.util.Scanner;
public class MergeList {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter list 1 size and contents: ");
		int len1 = stdin.nextInt();
		int list1[] = new int[len1];
		for (int i = 0; i < len1; i++) {
			list1[i] = stdin.nextInt();
		}
		System.out.print("Enter list 2 size and contents: ");
		int len2 = stdin.nextInt();
		int list2[] = new int[len2];
		for (int i = 0; i < len2; i++) {
			list2[i] = stdin.nextInt();
		}
		
		System.out.print("List 1: ");
		for (int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
		}
		
		System.out.print("\nList 2: ");
		for (int i = 0; i < list2.length; i++) {
			System.out.print(list2[i] + " ");
		}
		
		int[] merged = merge(list1, list2);
		
		System.out.print("\nMerged list: ");
		for (int i = 0; i < merged.length; i++) {
			System.out.print(merged[i] + " ");
		}
		
		stdin.close();
	}
	
	public static void bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
	public static int[] merge(int[] a1, int[] a2) {
		int mergedList[] = new int[a1.length + a2.length];
		for (int i = 0; i < a1.length; i++) {
			mergedList[i] = a1[i];
		}
		for (int i = a1.length; i < a1.length + a2.length; i++) {
			mergedList[i] = a2[i - a1.length];
		}
		bubbleSort(mergedList);
		return mergedList;
	}

}
