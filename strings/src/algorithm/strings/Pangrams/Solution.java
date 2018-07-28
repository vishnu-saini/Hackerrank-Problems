package algorithm.strings.Pangrams;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] input = br.readLine().toUpperCase().toCharArray();
        
        int[] result =  new int[26];
        for (char c : input) {
        	if(c >= 65 && c<= 90)
        	result[c-65] = 1;
		}
        boolean flag=true;
        for (int i : result) {
        	if(i == 0){
        		System.out.println("not pangram");
        		flag=false;
        		break;
        	}
		}
        if (flag) {
			System.out.println("pangram");
		}

    }
   
}