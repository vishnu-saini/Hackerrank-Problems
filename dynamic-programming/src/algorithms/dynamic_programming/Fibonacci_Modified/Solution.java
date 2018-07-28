package algorithms.dynamic_programming.Fibonacci_Modified;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		BigInteger a=new BigInteger(input[0]),b= new BigInteger(input[1]),temp;
		int n=Integer.parseInt(input[2]);
		for (int i = 0; i < n -2; i++) {
			temp = b;
			b=b.multiply(b).add(a);
			a=temp;
		}
		System.out.println(b);
		
	}
}