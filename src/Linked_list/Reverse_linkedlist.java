package Linked_list;

//A Linked List Node
class Node
{
 int data;//
 Node next;// points to next node
//
 Node(int datass, Node nextsss)// user defined next
 {
     this.data = datass;// Node(2,)
     this.next = nextsss;
 }
}

class Reverse_linkedlist
{
 // Helper function to print a given linked list
 public static void printList(Node head)
 {
     Node ptr = head; //Node type variable
     while (ptr != null)
     {
         System.out.print(ptr.data + " —> ");
         ptr = ptr.next;
     }

     System.out.println("null");
 }

 // Reverses a given linked list by changing its `.next` fields and
 // its head.
 //       $
//  head->1<-2->3->4-> NULL
//              |  *
 public static Node reverse(Node head)
 {
     Node previous = null;
     Node current = head;// [1,2] [2,3] [3,4]

     // traverse the list
     while (current != null)
     {
         // tricky: note the next node
         Node next = current.next;// next = 3

         current.next = previous;// 1  // fix the current node

         previous = current; // previous = 2
         current = next; // current = 3
     }

     // fix the head to point to the new front
     return previous;
 }

 public static void main(String[] args)
 {
     // input keys
     int[] keys = { 1, 2, 3, 4, 5, 6 };
     // 1-> 2->3->4
     Node head = null;
     //int i = null;
     for (int i = keys.length - 1; i >= 0; i--) {// 5 
         head = new Node(keys[i], head);// [6,null] [5,6] [4,5] [3,4] [2,3] [1,2] 
         
     }

     head = reverse(head);// reverse data 
     printList(head);
 }
}