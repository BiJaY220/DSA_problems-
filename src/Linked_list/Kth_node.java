package Linked_list;

//A Linked List Knode
class Knode
{
 int data;
 Knode next;

 Knode(int data, Knode next)
 {
     this.data = data;
     this.next = next;
 }
}

class Kth_node

{
 // Iterative function to return the k'th Knode from the end in a linked list
 public static Knode findKthKnode(Knode head, int k)
 {
     Knode curr = head;

     // move `k` Knodes ahead in the linked list
     for (int i = 0; curr != null && i < k; i++) {
         curr = curr.next;

         // return if `k` is more than the total number of Knodes in the list
         if (curr == null && i != k-1) {
             return null;
         }
     }

     // move the `head` and `curr` parallelly till `curr` reaches the list's end
     while (curr != null)
     {
         head = head.next;
         curr = curr.next;
     }

     // `head` will now contain the k'th Knode from the end
     return head;
 }

 public static void main(String[] args)
 {
     // input keys
     int[] keys = { 1, 2, 3, 4, 5 };

     Knode head = null;
     for (int i = keys.length - 1; i >= 0; i--) {
         head = new Knode(keys[i], head);
     }

     int k = 2;
     Knode Knode = findKthKnode(head, k);

     if (Knode != null) {
         System.out.println("k'th Knode from the end is " + Knode.data);
     }
 }
}
