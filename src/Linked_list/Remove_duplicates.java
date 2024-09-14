package Linked_list;
import java.util.HashSet;
import java.util.Set;
 
// A Linked List DNode
class DNode
{
    int data;
    DNode next;
 
    DNode(int data, DNode next)
    {
        this.data = data;
        this.next = next;
    }
}
 
class Remove_duplicates
{
    // Helper function to print a given linked list
    public static void printList(DNode head)
    {
        DNode ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
 
    // Function to remove duplicates from a sorted list
    public static DNode removeDuplicates(DNode head)
    {
        DNode previous = null;
        DNode current = head;
 
        // take an empty set to store linked list DNodes for future reference
        Set<Integer> set = new HashSet<>();
 
        // do till the linked list is empty
        while (current != null)
        {
            // if the current DNode is seen before, ignore it
            if (set.contains(current.data)) {
                previous.next = current.next;
            }
            else {
                // insert the current DNode into the set and proceed to the next DNode
                set.add(current.data);
                previous = current;
            }
            current = previous.next;
        }
 
        return head;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {5, 3, 4, 2, 5, 4, 1, 3};
 
        // points to the head DNode of the linked list
        DNode head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new DNode(keys[i], head);
        }
 
        removeDuplicates(head);
 
        // print linked list
        printList(head);
    }
}


