package algorithms.implementation.utopiantree;
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
			int season = Integer.parseInt(bufferedReader.readLine());
			int h = 1;
			for (int j = 0; j < season; j++) {
				if(j%2 == 0){
					h = 2 * h;
				}else{
					h = h + 1;
				}
				
			}
			System.out.println(h);
		}

	}
}