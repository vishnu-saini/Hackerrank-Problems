package algorithms.implementation.sherlockandsquares;
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
			String numberInString[]=bufferedReader.readLine().split(" ");
			int start=  Integer.parseInt(numberInString[0]);
			int end = Integer.parseInt(numberInString[1]);

			int count = 0, sqst=(int) Math.sqrt(start);
			while (sqst*sqst <= end) {
				if(sqst*sqst >= start){
					count++;
				}
				sqst++;
			}
			System.out.println(count);
		}

	}
}