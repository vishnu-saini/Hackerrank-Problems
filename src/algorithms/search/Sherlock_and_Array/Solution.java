package algorithms.search.Sherlock_and_Array;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			int a = 0, sum = add(arr),b;
			b=sum;
			boolean result = false;
			
			
			if (arr.length == 1) {
				result = true;
			} else if (arr.length > 2) {
				
				for (int j = 1; j < arr.length - 1; j++) {
					a=a+arr[j-1];
					b=sum-a-arr[j];
					if (a == b) {
						result = true;
						break;
					}
					if (a > b) {
						break;
					}
				}
			}

			if(result){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}

	public static int add(int array[]) {
		int sum = 0;
		for (int i : array)
			sum += i;
		return sum;
	}
}