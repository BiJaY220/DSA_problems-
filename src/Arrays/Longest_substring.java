package Arrays;

import java.util.HashMap;

public class Longest_substring {
	// abcdeafgbdfbgnbfgnabef 5 6 6
	// optimal
	public static int longeststring(String str) {
		int result = 0;
		int len = str.length();
		int max = 0;
		// create a hashmap -> stores last position
		// loop through the str -> math.max
		HashMap<Character, Integer> lastposition = new HashMap<>();
		
		for(int j =0 ; j<len; j++) {
			if (lastposition.containsKey(str.charAt(j))) {
				System.out.println(lastposition.get(str.charAt(j)));
				max = Math.max(max, lastposition.get(str.charAt(j))+1);
				
			}
			result = Math.max(result, j-max+1);
			
			lastposition.put(str.charAt(j), j);
			
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		String string = "ABCDEFAGHB";
		System.out.println("the longest substring is "+longeststring(string));
		
		
	}
	

}
