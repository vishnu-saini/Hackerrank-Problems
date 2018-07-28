package algorithm.warmup.timeconersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String input = bufferedReader.readLine();
		int hour = Integer.parseInt(input.substring(0, 2));
		if (input.substring(8).equals("PM")) {
			if(input.substring(0,2).equals("12")){
				System.out.println(input.substring(0, 8));
			}else
			System.out.println(hour + 12 + input.substring(2, 8));
		} else {
			if(input.substring(0,2).equals("12")){
				System.out.println("00"+input.substring(2, 8));
			}else{
				System.out.println(input.substring(0, 8));
			}
			
		}
	}

}