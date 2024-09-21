package Trees;

import java.util.concurrent.atomic.AtomicInteger;

//A class to store a BST Nodess
class Nodess
{
 int data;
 Nodess left = null, right = null;

 Nodess(int data) {
     this.data = data;
 }
}

class Largest_smallest

{
 // Recursive function to insert a key into a BST
 public static Nodess insert(Nodess root, int key)
 {
     // if the root is null, create a new Nodess and return it
     if (root == null) {
         return new Nodess(key);
     }

     // if the given key is less than the root Nodess, recur for the left subtree
     if (key < root.data) {
         root.left = insert(root.left, key);
     }

     // if the given key is more than the root Nodess, recur for the right subtree
     else {
         root.right = insert(root.right, key);
     }

     return root;
 }

 // Function to find the k'th largest Nodess in the BST.
 // Here, `i` denotes the total number of Nodesss processed so far
 public static Nodess kthLargest(Nodess root, AtomicInteger i, int k)
 {
     // base case
     if (root == null) {
         return null;
     }

     // search in the right subtree
     Nodess left = kthLargest(root.right, i, k);

     // if k'th largest is found in the left subtree, return it
     if (left != null) {
         return left;
     }

     // if the current Nodess is k'th largest, return its value
     if (i.incrementAndGet() == k) {
         return root;
     }

     // otherwise, search in the left subtree
     return kthLargest(root.left, i, k);
 }

 // Function to find the k'th largest Nodess in the BST
 public static Nodess kthLargest(Nodess root, int k)
 {
     // maintain index to count the total number of Nodesss processed so far
     AtomicInteger i = new AtomicInteger(0);

     // traverse the tree in an inorder fashion and return k'th Nodess
     return kthLargest(root, i, k);
 }

 public static void main(String[] args)
 {
     int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

     Nodess root = null;
     for (int key: keys) {
         root = insert(root, key);
     }

     int k = 2;
     Nodess Nodess = kthLargest(root, k);

     if (Nodess != null) {
         System.out.println(Nodess.data);
     }
     else {
         System.out.println("Invalid Input");
     }
 }
}

