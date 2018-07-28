package algorithms.strings.Caesar_Cipher;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int k = in.nextInt();
        for (int i = 0; i < s.length; i++) {
			if (s[i] >=65 && s[i]<=90 ) {
				s[i]=(char)(s[i]+k);
				while(s[i]>90){
					s[i]=(char)(s[i]-26);
				}
			}else if(s[i] >=97 && s[i]<=122 ){
				s[i]=(char)(s[i]+k);
				while(s[i]>122){
					s[i]=(char)(s[i]-26);
				}
			}
			System.out.print(s[i]);
		}
        
    }
}