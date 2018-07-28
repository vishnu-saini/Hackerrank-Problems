package algorithms.implementation.Cavity_Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        String result[]=grid.clone();
        for (int i = 1; i < grid.length-1; i++) {
			for (int j = 1; j < grid.length-1; j++) {
				if(grid[i].charAt(j) > grid[i-1].charAt(j) && grid[i].charAt(j) > grid[i].charAt(j-1) && grid[i].charAt(j) > grid[i].charAt(j+1) && grid[i].charAt(j) > grid[i+1].charAt(j) ){
					result[i] = result[i].substring(0,j)+'X'+result[i].substring(j+1);
				}
			}
		}
        
        for (String string : result) {
			System.out.println(string);
		}
    }
}