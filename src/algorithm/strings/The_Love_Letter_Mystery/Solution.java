package algorithm.strings.The_Love_Letter_Mystery;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=Integer.parseInt(sc.nextLine());
		for (int i = 0; i < testcase; i++) {
			String st=sc.nextLine();
			int move=0;
			for (int j = 0; j < st.length()/2; j++) {
				move+=Math.abs(st.charAt(j) - st.charAt(st.length() - j - 1));
			}
			System.out.println(move);
		}
	}
}