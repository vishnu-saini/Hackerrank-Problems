package algorithms.warmup.diagonaldifference;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

        public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bufferedReader.readLine());
        
        long R1=0,R2=0;
        for (int i = 0; i < n; i++) {
        	String[] input=bufferedReader.readLine().split(" ");
			R1=R1+Long.parseLong(input[i]);
			R2=R2+Long.parseLong(input[n-i-1]);
		}
        System.out.println(Math.abs(R1-R2));
    }
}