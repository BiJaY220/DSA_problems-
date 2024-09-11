package Graph;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Course_problem {
	/*There are totally 4 courses, but you can take 3 courses at most:
		First, take the 1st course, it costs 100 days so you will finish it on the 100th day, and ready to take the next course on the 101st day.
		Second, take the 3rd course, it costs 1000 days so you will finish it on the 1100th day, and ready to take the next course on the 1101st day. 
		Third, take the 2nd course, it costs 200 days so you will finish it on the 1300th day. 
		The 4th course cannot be taken now, since you will finish it on the 3300th day, which exceeds the closed date.*/

	// [[9,10],[3,12],[5,15],[4,18],[10,19],[10,20],[5,20]]
	// -> brute force 4
	
	//
	
	public static int courseSelect(int[][] courses) {
	
		Arrays.sort(courses, (a,b)-> a[1]==b[1]? a[0]-b[0]: a[1]-b[1]);
		PriorityQueue<Integer> pQueue = new PriorityQueue<>((a,b)-> b-a);
		int deadline = 0;
		
		
		for (int[] course: courses ) {
			if (course[0]<=course[1]) {
				if (course[0]+deadline <= course[1]) {
					
				pQueue.offer(course[0]);
				deadline += course[0];
				}
				
			}else {
				
				if (pQueue.peek()>course[0]) {
					deadline-= pQueue.poll();
					deadline+=course[0];
					pQueue.offer(course[0]);
					
					
				}
			}
			
			
			
			
			
			
			
		}
		
		return pQueue.size();
	}
	public static void main(String[] args) {
		int [][] courses = {{9,10},{3,12},{5,15},{4,18},{10,19},{10,20},{5,20}};
		System.out.println("the possible courses are  :"+courseSelect(courses));
		
		
		
	}
	
}
