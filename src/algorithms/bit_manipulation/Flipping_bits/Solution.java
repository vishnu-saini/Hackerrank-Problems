package algorithms.bit_manipulation.Flipping_bits;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < testcase; i++) {
			long a = Long.parseLong(sc.nextLine());
			StringBuilder result=new StringBuilder();
			String binary=Long.toBinaryString(a);
			
			for (int j = 0; j < 32; j++) {
				if (j < binary.length()) {
					if(binary.charAt(j) == '0'){
						result.append('1');
					}else if (binary.charAt(j) == '1') {
						result.append('0');
					}
				}else
					result.insert(0	,'1');
			}
			System.out.println(Long.parseLong(result.toString(),2));
			
		}
	}
}