package algorithm.warmup.minmaxsum;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
                long min=0, max=0, temp=0;
        for (int i = 1; i < arr.length; i++) {
			temp=temp+arr[i];
		}
        min=max=temp;
        for (int i = 1; i < arr.length; i++) {
        	temp=0;
			for (int j = 0; j < i; j++) {
				temp+=arr[j];
			}
			for (int j = i+1; j < arr.length; j++) {
				temp+=arr[j];
			}
			if(temp< min){
				min=temp;
			}
			if(temp> max){
				max=temp;
			}
		}
        System.out.println(min+" "+max);
    }
}