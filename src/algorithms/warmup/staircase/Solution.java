package algorithms.warmup.staircase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
              BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
				if (i > n- j - 2) {
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
        	System.out.println();
		}
    }
}