package interview_preparation.arrays.New_Year_Chaos;

import java.util.Scanner;

public class Solution {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		for (int i = 0; i < q.length; i++) {
			if (q[i] - (i + 1) > 2) {
				System.out.println("Too chaotic");
				return;
			}
		}

		int bribes = 0;
		int pointer = q.length - 1;
		outer: while (true) {

			while (q[pointer] == (pointer + 1)) {
				pointer--;
				if (pointer == 0)
					break;
			}

			for (int i = pointer; i > 0; i--) {
				if (q[i] < q[i - 1]) {
					int tmp = q[i];
					q[i] = q[i - 1];
					q[i - 1] = tmp;
					bribes++;
					continue outer;
				}
			}
			break;
		}

		System.out.println(bribes);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}
