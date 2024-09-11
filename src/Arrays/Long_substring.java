package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Long_substring {
	// abcdadefgha ->4 , 6
	// j  a v a -> 4  
	// !      *
	// adscbsdaf -> 5 4 6 -> scbsdaf
	// brute force method 
	// optimal solution ->
	public static void main(String[] args) {
		 String valueString = "java";
		 System.out.println("the length of the maximum substring is :"+maxsubstring(valueString));
		
	}
	
	public static int maxsubstring(String s) {
		int left = 0, right = 0;// for defining window 
		Set<Character> foundCharacters = new HashSet<>();
		//  a  d  s  c  b  s  d  a  f
		//  !*
		int maximum = 0; // max substring 
		while(right<s.length()) { //9<9
			char c = s.charAt(right);
			if (foundCharacters.add(c)) { // c b s d a f
				
				maximum = Math.max(maximum, right-left+1);// 6
				right ++;
				
			}else {
				while(s.charAt(left)!=c) {//j!=a
					foundCharacters.remove(s.charAt(left)); // 
					left++;
					
				}
				foundCharacters.remove(c);
				left++;
				
			}}
		return maximum;
		
	}
	
	
	
	
	
	
	
	
	
}
