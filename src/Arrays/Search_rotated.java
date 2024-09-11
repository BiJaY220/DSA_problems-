package Arrays;

public class Search_rotated {
	// search a given value in a rotated and sorted array
	//searching in sorted rotated array
	// array ->   O(n) O(1) target -> 20
	// brute method ->O(n) -> worst best O(1)
	// optimal solution -> Binary search (BS)
	// steps -> mid target value = 100
	// 
	// {50,100,10, 20,30, 35,40}  -> target -> 100
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//{120,130,40,50,90,100} -> target -> 150
	 // O(n/2) -> BS       
	public static int search(int[] nums , int target) {
		int left = 0, right = nums.length-1;// getting the index
		int mid = (left+right)/2; // 2
		while (left <= right ) {// 5<=5
			mid = (left+right)/2; // 5
			if(target == nums[mid]) {//
				return mid;
			}
			if(nums[left]<nums[mid]) {// left part is sorted yes
				if (nums[left]<=target && nums[mid]>target) {// 20<30<50
					right = mid -1; // 2
					
				}else {
					left = mid +1;// 5
					
				}
				}else {// right part sorted
				if(nums[right]>=target && nums[mid]< target) {// 100>100
					left = mid +1;//3
					
				}else {
					right = mid -1;
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
