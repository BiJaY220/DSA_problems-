package Arrays;

public class Container {
	// given -> height of the container { 1,5,6,3,4,2}
	
	// optimal solution -> 
	public static int maxArea(int[] height) {
		int max = 0;
		int l = 0;
		int r = height.length-1;
		while (l<r) {
			int lv = height[l];
			int rv = height[r];
			int min = Math.min(lv, rv);
			int len = r-l;
			int area = min * len;
			max = Math.max(max, area);
			if (lv<rv) l++;
			else r--;
			
			
			
			
		}
		
		
		return  max;
	}
	public static void main(String[] args) {
		int h[] = {1,5,6,3,4,2};
		System.out.println("the maximum amount of water contained is :"+maxArea(h));
		
		
	}

}
