package algorithms.implementation.Chocolate_Feast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		int cases=Integer.parseInt(bufferedReader.readLine());
		int n,c,m,count;
		for (int i = 0; i < cases; i++) {
			String [] input = bufferedReader.readLine().split(" ");
			n=Integer.parseInt(input[0]);
			c=Integer.parseInt(input[1]);
			m=Integer.parseInt(input[2]);
			
			count =  n/c;
			int wrapperCount = count;
			
			while ( wrapperCount >= m ) {
				int a = wrapperCount/m;
				count = count + a;
				wrapperCount = wrapperCount%m + a ;
			}
			System.out.println(count);
		}

	}
}