package algorithms.strings.gameofthrons1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	// Complete the gameOfThrones function below.
	static String gameOfThrones(String s) {
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (frequency.containsKey(s.charAt(i)))
				frequency.put(s.charAt(i), frequency.get(s.charAt(i)) + 1);
			else
				frequency.put(s.charAt(i), 1);
		}
		boolean flag = true;
		if (s.length() % 2 == 0) {
			for (Integer val : frequency.values()) {
				if (val % 2 != 0) {
					flag = false;
					break;
				}
			}
		} else {
			int oddcount = 0;
			for (Integer val : frequency.values()) {

				if (val % 2 != 0) {
					if (oddcount == 0) {
						oddcount++;
					} else {
						flag = false;
						break;
					}
				}
			}
		}

		if (flag)
			return "YES";
		else
			return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String s = scanner.nextLine();

		String result = gameOfThrones(s);
		System.out.println(result);
		scanner.close();
	}
}
