package algorithms.warmup.plusminus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
               BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bufferedReader.readLine());
        String[] input=bufferedReader.readLine().split(" ");
        int countN=0,countP=0,countZ=0;
        for (int i = 0; i < n; i++) {
        	if (Integer.parseInt(input[i]) < 0) {
				countN++;
			}else if(Integer.parseInt(input[i]) > 0) {
				countP++;
			}else{
				countZ++;
			}
		}
        System.out.println((float)countP/n);
        System.out.println((float)countN/n);
        System.out.println((float)countZ/n);
    }
}