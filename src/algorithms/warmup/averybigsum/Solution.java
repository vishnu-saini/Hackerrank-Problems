package algorithms.warmup.averybigsum;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int number= Integer.parseInt(bufferedReader.readLine());
        String[] input=bufferedReader.readLine().split(" ");
        long sum=0;
        for (int i = 0; i < input.length; i++) {
			sum=sum+Long.parseLong(input[i]);
		}
        System.out.println(sum);
    }
}