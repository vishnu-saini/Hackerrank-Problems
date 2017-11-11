package algorithms.implementation.taumandbirthday;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            if(x > z+y){
            	long result=b*(z+y)+w*y;
            	System.out.println(result);
            }else if(y > z+x){
            	long result=b*x+w*(z+x);
            	System.out.println(result);
            }else{
            	long result=b*x+w*y;
            	System.out.println(result);
            }
        }
    }
}