package algorithms.sorting.Running_Time_of_Algorithms;
import java.util.Scanner;

public class Solution {

	public static int insertionSortPart2(int[] ar) {
		int shiftcount=0;
		for (int i = 1; i < ar.length; i++) {
			int valueToSort = ar[i];
			int j = i;
			while (j > 0 && ar[j - 1] > valueToSort) {
				ar[j] = ar[j - 1];
				j--;
				shiftcount++;
			}
			ar[j] = valueToSort;
		}
		return shiftcount;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		System.out.println(insertionSortPart2(ar));

	}
}