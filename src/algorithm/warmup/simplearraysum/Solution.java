package algorithm.warmup.simplearraysum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount = Integer.parseInt(r.readLine());
		int sum = 0;
		String[] input = r.readLine().split(" ");
		for (int i = 0; i < testCaseCount; i++) {
			sum = sum + Integer.parseInt(input[i]);
		}
		System.out.println(sum);
	}
}