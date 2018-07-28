package algorithms.implementation.Lisas_Workbook;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");
		int pageNumber = 1;
		int result=0;
		for (int i = 1; i <= n; i++) {
			int numOfProblem = Integer.parseInt(input[i-1]);
			if (numOfProblem >= pageNumber) {
				for (int j = 1; j <= numOfProblem; j=j+k) {
					for (int j2 = j; j2 <= (numOfProblem<(j+k-1)?numOfProblem:(j+k-1)); j2++) {
						if (pageNumber == j2) {
							result++;
						}
					}
					pageNumber++;
				}
			}else{
				pageNumber=pageNumber+numOfProblem/k+(numOfProblem%k>0?1:0);
			}

		}
		System.out.println(result);
	}
}