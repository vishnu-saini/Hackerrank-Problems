package algorithms.bit_manipulation.Lonely_Integer;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int input[][] = new int[testcase][2];
		int size = 0;
		outer: for (int i = 0; i < testcase; i++) {
			int a = sc.nextInt();
			for (int j = 0; j < size; j++) {
				if (input[j][0] == a) {
					input[j][1]++;
					continue outer;
				}
			}

			input[size][0] = a;
			input[size][1]++;
			size++;
		}
		
		for (int i = 0; i < size; i++) {
			if(input[i][1] == 1 ){
				System.out.println(input[i][0]);
				break;
			}
		}    }
}