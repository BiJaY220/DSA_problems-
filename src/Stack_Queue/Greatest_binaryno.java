package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Queue;
 
class Greatest_binaryno
{
    // Function to generate binary numbers between 1 and `n` using the
    // queue data structure 1, 10 ,11 ,100 , 101,
    public static void generate(int n)
    {
        // create an empty queue and enqueue 1 
    	// 5
        Queue<String> q = new ArrayDeque<>();
        q.add("1");// FIFO 
 // 11101
        // run `n` times
        int i = 1;// 
        while (i++ <= n)// 
        {
            // append 0 and 1 to the front element of the queue and
            // enqueue both strings
            q.add(q.peek() + '0');// 111110101100
            q.add(q.peek() + '1');// 10 + '1'
            
 
            // remove the front element and print it
            System.out.print(q.poll() + ' ');// 1 10 11
            
        }
    }
 
    public static void main(String[] args)
    {
        int n = 16;
        generate(n);
    }
}
