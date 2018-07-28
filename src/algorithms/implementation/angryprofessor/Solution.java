package algorithms.implementation.angryprofessor;
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
			String input[]=bufferedReader.readLine().split(" ");
			int students=Integer.parseInt(input[0]), threshhold = Integer.parseInt(input[1]);
			input = bufferedReader.readLine().split(" ");
			int attendence =0;
			for (int j = 0; j < students; j++) {
				if (Integer.parseInt(input[j]) <= 0) {
					attendence++;
				}
			}
			if (attendence >= threshhold) {
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
			
		}
		
	}
}