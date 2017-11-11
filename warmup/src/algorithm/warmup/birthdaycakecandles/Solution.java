package algorithm.warmup.birthdaycakecandles;
import java.util.Scanner;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
         	int result=0,maxHeight=0;
    	for (int i : ar) {
			if(i>maxHeight){
				maxHeight=i;
				result=1;
			}else if (i==maxHeight) {
				result++;
			}
		}
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}