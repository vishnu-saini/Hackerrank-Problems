package algorithms.implementation.finddigits;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < testcase; i++) {
			String numberInString=bufferedReader.readLine();
			int number = Integer.parseInt(numberInString);
			int count = 0;
			for (int j = 0; j < numberInString.length(); j++) {
				if (Integer.parseInt(""+numberInString.charAt(j)) != 0 && number % Integer.parseInt(""+numberInString.charAt(j)) == 0 ) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
}