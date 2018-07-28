package algorithms.strings.Funny_String;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String args[] ) throws Exception {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int testcase=Integer.parseInt(br.readLine());

    	for (int i = 0; i <testcase; i++) {
    		char [] input = br.readLine().toCharArray();
    		boolean result=true;
    		for (int j = 1; j < input.length; j++) {
				if(!(Math.abs(input[j] - input[j-1]) == Math.abs(input[input.length -j] - input[input.length - j - 1]) )){
					result =false;
					break;
				}
			}
    		if (result)System.out.println("Funny");else System.out.println("Not Funny");
		}

    }
}