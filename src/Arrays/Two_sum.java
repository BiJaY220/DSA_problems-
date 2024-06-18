package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
	// array of int[] ={1,3,6,8} , 14
	// two approach -> brute force O(n^2)
	// given cond -> array , target value
	// best approach ???
	public static int[] twoSumm(int[]numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i<numbers.length; i++) {
			// int result = numbers[i]+numbers[i+1];
			int negation = target - numbers[i];
			if(map.containsKey(negation)) {
				System.out.println("the negation is "+map.get(negation));
				System.out.println("the value of i is "+i);
				return new int[] {numbers[map.get(negation)],numbers[i]};
				// numbers[i]
			}
			map.put(numbers[i], i);
			
			
		}
		return null;
		
		
		
	}
	public static void main(String[] args) {// water container 
		int numbers[]= {1,3,6,8};
		int n = 14;
		int result[] = twoSumm(numbers, n);
		
		if (result!= null) {
			
			System.out.println("the numbers are "+Arrays.toString(result));// point *
			
		}else
		System.out.println("the value are not provided");
			
		
		
		
	}

}
