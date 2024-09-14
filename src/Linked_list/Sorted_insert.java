package Linked_list;
//A Linked List Our_Node
class Our_Node
{
 int data;
 Our_Node next;

 Our_Node(int data, Our_Node next)
 {
     this.data = data;
     this.next = next;
 }

 Our_Node(int data) {
     this.data = data;
 }
}

class Sorted_insert	
{
 // Helper function to print a given linked list
 public static void printList(Our_Node head)
 {
     Our_Node ptr = head;
     while (ptr != null)
     {
         System.out.print(ptr.data + " —> ");
         ptr = ptr.next;
     }

     System.out.println("null");
 }

 // Function to insert a given Our_Node at its correct sorted position into
 // a given list sorted in increasing order
 public static Our_Node sortedInsert(Our_Node head, Our_Node newOur_Node)
 {
     // special case for the head end
     if (head == null || head.data >= newOur_Node.data)
     {
         newOur_Node.next = head;
         head = newOur_Node;
         return head;
     }

     // locate the Our_Node before the point of insertion
     Our_Node current = head;
     while (current.next != null && current.next.data < newOur_Node.data) {
         current = current.next;
     }

     newOur_Node.next = current.next;
     current.next = newOur_Node;

     return head;
 }

 public static void main(String[] args)
 {
     // input keys
     int[] keys = {2, 4, 6, 8};

     // points to the head Our_Node of the linked list
     Our_Node head = null;

     // construct a linked list
     for (int i = keys.length - 1; i >= 0; i--) {
         head = new Our_Node(keys[i], head);
     }

     head = sortedInsert(head, new Our_Node(5));
     head = sortedInsert(head, new Our_Node(9));
     head = sortedInsert(head, new Our_Node(1));

     // print linked list
     printList(head);
 }
}

