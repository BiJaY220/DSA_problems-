package Stack_Queue;

import java.util.Stack;

public class Reverse_string_sewuence {
	
	// Function to reverse a text without reversing the individual words
	// s1 -> today is sunny -> sunny is today
	// -> LIFO
	// "today is sunny" high = i , low = high 
	// 
	
	
public static String reverseText(String s)
	{
	        // base case , edge case 
	        if (s == null || s.length() == 0) {
	            return s;
	        }
	 
	        // `s[low…high]` forms a word
	        int low = 0, high = 0;
	 
	        // create an empty stack
	        Stack<String> stack = new Stack<>();
	 
	        // scan the text
	        for (int i = 0; i < s.length(); i++)
	        {// "today_is sunny" s.substring(0,5)
	            // if space is found, we found a word
	            if (s.charAt(i) == ' ') // i =5
	            {
	            	
	                // push each word into the stack
	                stack.push(s.substring(low, high + 1));// (0,5)
	 
	                // reset `low` and `high` for the next word
	                low = high = i + 1;// low = high ; high = i +1;
	            }
	            else {
	                high = i;// high = 4
	            }
	        }
	 
	        // push the last word into the stack
	        stack.push(s.substring(low));
	 
	        // construct the string by following the LIFO order
	        StringBuilder sb = new StringBuilder();
	        while (!stack.empty()) {
	            sb.append(stack.pop()).append(' ');
	        }
	 
	        return sb.substring(0, sb.length() - 1);    // remove last space
	    }
	 
	 
	    public static void main(String[] args)
	    {
	        String s = "today is sunny";
	 
	        System.out.println(reverseText(s));
	    }
	



}
