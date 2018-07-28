package algorithm.strings.Alternating_Characters;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=Integer.parseInt(sc.nextLine());
		for (int i = 0; i < testcase; i++) {
			String st=sc.nextLine();
			int delcount=0;
			for (int j = 1; j < st.length(); j++) {
				if(st.charAt(j-1) ==  st.charAt(j))delcount++;
			}
			System.out.println(delcount);
		}
	}
}