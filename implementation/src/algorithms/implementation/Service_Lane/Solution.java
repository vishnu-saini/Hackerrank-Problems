package algorithms.implementation.Service_Lane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String input[] = bufferedReader.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int testcase = Integer.parseInt(input[1]);
		input=bufferedReader.readLine().split(" ");
		int steps[]=new int[n];
		for (int i = 0; i < n; i++) {
			steps[i]=Integer.parseInt(input[i]);
		}
		for (int i = 0; i < testcase; i++) {
			String numberInString[]=bufferedReader.readLine().split(" ");
			int start=  Integer.parseInt(numberInString[0]);
			int end = Integer.parseInt(numberInString[1]);
			int min = steps[start];
			for (int j = start; j <= end; j++) {
				if (steps[j] < min ) {
					min = steps[j];
				}
			}
			System.out.println(min);
			
		}

	}
}