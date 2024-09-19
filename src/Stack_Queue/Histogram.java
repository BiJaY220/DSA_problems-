package Stack_Queue;

//import statement  
import java.util.Stack;  

public class Histogram 
{  
	//The main method for computing the maximum rect area using the input  
	//histogram array with s bars  
	public int findMaxArea(int histArr[], int s)  
	{  
	//Creating an empty stack. The stack keeps indices of the histArr[] array  
	//The bars kept in the stack are in increasing order as per their heights  
	Stack<Integer> stk = new Stack<>();  
	
	int maxArea = 0; // Initializing the max area  
	int top; // for keeping the top of the stack  
	int areaWithTop; // for keeping the area with the bar at the top as the smallest bar  
	
	//Run through all bars of given histogram  
	int j = 0;  
	while (j < s)  
	{  
	//If the bar is longer than the bar present at the top of the stack, then push the bar to //the stack  
	if (stk.empty() || histArr[stk.peek()] <= histArr[j])  
	stk.push(j++);  
	
	//If the bar is lower than the top of the stack, then compute the area of the rectangle  
	//with the top of the stack as the min-height bar. 'j' is the right index for the   
	//top and the element before the top in the stack is the 'left index'  
	else  
	{  
	top = stk.peek(); // storing the index at the top  
	stk.pop(); // popping the top  
	
	//computing the area with histArr[top] stack as the smallest bar  
	areaWithTop = histArr[top] * (stk.empty() ? j : j - stk.peek() - 1);  
	
	//updating the maximum area, if requried  
	if (maxArea < areaWithTop)  
	{  
	maxArea = areaWithTop;  
	}  
	}  
	}  
	
	//Now popping the left bars from the stack and computing the area with each bar  
	//that is popped as the bar that is smallest  
	while (stk.empty() == false)  
	{  
	top = stk.peek();  
	stk.pop();  
	areaWithTop = histArr[top] * (stk.empty() ? j : j - stk.peek() - 1);  
	
	if (maxArea < areaWithTop)  
	maxArea = areaWithTop;  
	}  
	
	return maxArea;  
	
	}  
	
	//Driver method to test above methods  
	public static void main(String[] args)  
	{  
	int[] histArr = {7, 2, 6, 5, 6, 2, 7};  
	int s = histArr.length; // computing size  
	
	//creating an object of the class LargestRectArea2  
	Histogram obj = new Histogram();  
	System.out.println("The maximum rectangular area is: " + obj.findMaxArea(histArr, s));  
	}  
	}  
