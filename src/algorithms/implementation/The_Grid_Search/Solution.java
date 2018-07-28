package algorithms.implementation.The_Grid_Search;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}
			boolean flag=false;
			
			if(R>=r && C>=c)
			
			outer:
			for (int i = 0; i <= G.length - P.length; i++) {
				if (G[i].contains(P[0])) {
					int index=G[i].indexOf(P[0]);
					inner:
					for (int j = 0; j < P.length; j++) {
						if(!(P[j].equals(G[i+j].substring(index, index+P[0].length())))){
							if (G[i].indexOf(P[0], index+1) >= 0) {
								index=G[i].indexOf(P[0], index+1);
								j=-1;
								continue;
								
							}
							break inner;
						}
						if(j == P.length-1){
							flag=true;
							break outer;
						}
					}
				}
			}
			
			System.out.println(flag?"YES":"NO");

		}
	}
}