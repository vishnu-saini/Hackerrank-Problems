package algorithms.implementation.cutthesticks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		int numOfStick=Integer.parseInt(bufferedReader.readLine());
		String input[] = bufferedReader.readLine().split(" ");
		int []list=new int[numOfStick];
		for (int i = 0; i < input.length; i++) {
			list[i]=Integer.parseInt(input[i]);
		}
		Arrays.sort(list);
		boolean flag=true;
		int length=list.length;
		int count=list.length;
		
		while (flag) {
			System.out.println(count);
			int min=list[length-count];
			for (int i = length - count ; i < length; i++) {
				if (min == list[i]) {
					count--;
				}
				list[i]=list[i]-min;
			}
			
			if (list[0] == 0 && list[length-1] == 0) {
				flag=false;
			}
		}


	}
}