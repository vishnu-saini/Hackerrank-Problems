package algorithms.strings.Gemstones;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=Integer.parseInt(sc.nextLine());
		List<String> input=new ArrayList<String>();
		Set<Character> charList=new HashSet<Character>();
		for (int i = 0; i < testcase; i++) {
			String st=sc.nextLine();
			input.add(st);
			for (int j = 0; j < st.length(); j++) {
				charList.add(st.charAt(j));
			}			
		}
		int gemCount=0;
		outer:
		for (Character character : charList) {
			
			for (String str : input) {
				if(str.indexOf(character) == -1){
					continue outer;
				}
			}
			gemCount++;
		}
    System.out.println(gemCount);
	}
}