package algorithms.implementation.Between_Two_Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {


    static int getTotalX(int[] a, int[] b) {
        
        int count = a[a.length - 1];
        int upto = b[0];
        
        List<Integer> finalArray = new ArrayList<>();
        
        while (true){
            boolean flag=true;
            for (int i = 0;i<a.length;i++) {
                if(count%a[i] != 0){
                    flag=false;
                    break;
                }
                    
            }
            if(flag){
                for (int i = 0; i < b.length; i++) {
                    if(b[i]%count != 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) finalArray.add(count);
            count+=a[a.length - 1];
            if(count > upto) break;
        }
        
        return finalArray.size();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int total = getTotalX(a, b);

        System.out.println(total);
    }
}