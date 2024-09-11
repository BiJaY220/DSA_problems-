package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
	
	// two approach -> brute force O(n^2)
	// given cond -> array , target value
	// best approach ???
	// loop 
	// negation = target-a
	// check if map contains negation 
	// return the index of the value , negation -> index (success)
	// else goto next value
	// array of int[] ={1,3,6,8,5,4} , 14
	public static int[] twoSumm(int[]numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i<numbers.length; i++) {//3
			// int result = numbers[i]+numbers[i+1];
			int negation = target - numbers[i];// 6
			if(map.containsKey(negation)) {// map.const..(key) -> true or false
				System.out.println("the value of negation in map is "+map.get(negation));//2
				System.out.println("the value of i(index) is "+i);//3  map.get(key)-> value of that key
				return new int[] {numbers[map.get(negation)],numbers[i]};//{6,8}
				// numbers[i]
			}
			map.put(numbers[i], i);// 0->0, 4->1, 8->2, 10->3 
			
			
		}
		return null;
		
		
		
	}
	public static void main(String[] args) {// water container 
		int numbers[]= {0,5,8,10,12,16,9,7};
		int n = 16;
		int result[] = twoSumm(numbers, n);
		
		if (result!= null) {
			
			System.out.println("the numbers are "+Arrays.toString(result));// point *
			
		}else
		System.out.println("the value are not provided");
			
		
		
		
	}

}
