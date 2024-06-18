package Arrays;

public class Search_rotated {
	//searching in sorted rotated array
	// array -> {50,100,10, 20,30, 35,40}   O(n) O(1) target -> 20
	// brute method ->
	// optimal solution -> 
	public static int search(int[] nums , int target) {
		int start = 0, end = nums.length-1;
		int mid = (start+end)/2;
		while (start <= end ) {
			mid = (start+end)/2;
			if(target == nums[mid]) {
				return mid;
			}
			if(nums[start]<=nums[mid]) {
				if (nums[start]<=target && nums[mid]>=target) {
					end = mid -1;
					
				}else {
					start = mid +1;
					
				}
				
				
				
			}else {
				if(nums[end]>=target && nums[mid]<= target) {
					start = mid +1;
					
				}else {
					end = mid -1;
				}
				
			}
			
		}
		
		return -1;
		
		
		
		
		
		
	
	}
	public static void main(String[] args) {
		int rot[] = {50,60,70,10,20,30,40};
		int tar = 20;
		System.out.println("the index position of the target value is "+search(rot, tar));
	}
	}
