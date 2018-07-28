package algorithm.sorting.Insertion_Sort_Part1;
import java.util.Scanner;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
   	if((ar.length > 1 && ar[ar.length - 1] >= ar[ar.length - 2]) || ar.length <= 1 ){
    		printArray(ar);
    		return;
    	}
    	int last = ar[ar.length - 1];
    	ar[ar.length - 1] = ar[ar.length - 2];
    	
    	for (int i = ar.length  - 2; i >= 0 ; i--) {
    		if(ar[i] <= last){
    			ar[i+1]=last;
    			printArray(ar);
    			return;
    		}else{
    			ar[i+1]=ar[i];
    			printArray(ar);
    		}
    		if(i-1 < 0){
    			ar[i]=last;
    			printArray(ar);
    		}
		}
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 