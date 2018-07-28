package algorithms.greedy.Sherlock_and_The_Beast;
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
			int caseNum = Integer.parseInt(bufferedReader.readLine());
			if (caseNum >= 3) {
				if (caseNum % 3 == 0) {
					for (int j = 0; j < caseNum; j++) {
						System.out.print(5);
					}
				} else if (caseNum % 3 == 2) {
					for (int j = 0; j < caseNum - 5; j++) {
						System.out.print(5);
					}
					System.out.print(33333);
				} else if (caseNum % 3 == 1 && caseNum >= 10) {

					for (int j = 0; j < caseNum - 10; j++) {
						System.out.print(5);
					}
					System.out.print("3333333333");
					
					
				} else {
					System.out.print(-1);
				}
			} else {
				System.out.print(-1);
			}
			System.out.println();
		}

	}

}