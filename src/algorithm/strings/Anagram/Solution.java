package algorithm.strings.Anagram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String args[] ) throws Exception {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int testcase=Integer.parseInt(br.readLine());
    	
    	ArrayList<Character> set1=new ArrayList<Character>(),set2=new ArrayList<Character>();
    	for (int i = 0; i <testcase; i++) {
    		char [] input = br.readLine().toCharArray();
    		if(input.length % 2 == 0 ){
    			for (int j = 0; j < input.length; j++) {
					if(j<input.length/2){
						set1.add(input[j]);
					}else {
						set2.add(input[j]);
					}
				}
    			for (char c : set1) {
    				if(set2.contains(c)){
    					set2.remove(new Character(c));
    				}
				}
    			System.out.println(set2.size());
    		}else{
    			System.out.println(-1);
    			
    		}
    		set1.clear();set2.clear();
		}

    }
}