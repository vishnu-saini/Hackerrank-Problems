package algorithms.sorting.Intro_to_Tutorial_Challenges;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int find = Integer.parseInt(br.readLine());
		int length = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			if (find == Integer.parseInt(input[i]))
				System.out.println(i);
		}
	}
}