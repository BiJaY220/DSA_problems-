package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Stackimp {
		// Stack -> concept -> LIFO , FILO
	// 3,4,5,6 -> |  -> 6 operations -> push pop top 
	// Implementation of stack using queues(2)(push costly O(n)-> pop O(1) , pop costly-> push O(1) )
	// 3,4,5,6
	// if push operation has to be costly then you must use two queues
	// if 
	
	// -> q1 3 4      q2 
	static class Stack{
		static Queue<Integer> q1 = new LinkedList<Integer>();
		static Queue<Integer> q2 = new LinkedList<Integer>();
		 
		
		
		static int size ;// no of elements 
		// push costly 
		static void push(int x) {
			q2.add(x);
			// remaining to q1
			while(q1.isEmpty()) {
				q2.add(q1.peek());
				q1.remove();
			}
			// swap the name of the queue
			Queue<Integer> queue = q1;
			q1= q2;
			q2= queue;
			
			
		}
		static void pop() {
			
		}
//		static int top() {
//			
//		}
//		static int sizee() {
//			
//		}
		
		
		
		
		
		
		
	}
}
