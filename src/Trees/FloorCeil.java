package Trees;

class Nodevalue
{
    int data;
    Nodevalue left, right;
 
    Nodevalue(int data) {
        this.data = data;
    }
}
 
class FloorCeil
{
    private Nodevalue floor, ceil;
 
    FloorCeil()
    {
        floor = new Nodevalue(-1);
        ceil = new Nodevalue(-1);
    }
 
    public void setCeil(Nodevalue ceil) {
        this.ceil = ceil;
    }
 
    public void setFloor(Nodevalue floor) {
        this.floor = floor;
    }
 
    public int getCeilData() {
        return ceil.data;
    }
 
    public int getFloorData() {
        return floor.data;
    }
}
 
class Main
{
    // Recursive function to insert a key into a BST
    public static Nodevalue insert(Nodevalue root, int key)
    {
        // if the root is null, create a new Nodevalue and return it
        if (root == null) {
            return new Nodevalue(key);
        }
 
        // if the given key is less than the root Nodevalue, recur for the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        // if the given key is more than the root Nodevalue, recur for the right subtree
        else {
            root.right = insert(root.right, key);
        }
 
        return root;
    }
 
    // Recursive function to find the floor and ceil of a given key in the BST.
    public static void findFloorCeil(Nodevalue root, FloorCeil obj, int key)
    {
        while (root != null)
        {
            // if a Nodevalue with the desired value is found, both floor and ceil is equal
            // to the current Nodevalue
            if (root.data == key)
            {
                obj.setFloor(root);
                obj.setCeil(root);
                break;
            }
 
            // if the given key is less than the root Nodevalue, visit the left subtree
            else if (key < root.data)
            {
                // update ceil to the current Nodevalue before visiting the left subtree
                obj.setCeil(root);
                root = root.left;
            }
 
            // if the given key is more than the root Nodevalue, visit the right subtree
            else {
                // update floor to the current Nodevalue before visiting the right subtree
                obj.setFloor(root);
                root = root.right;
            }
        }
    }
 
    public static void main(String[] args)
    {
        /* Construct the following tree
                   8
                 /   \
                /     \
               4       10
              / \     /  \
             /   \   /    \
            2     6 9     12
        */
 
        int[] keys = { 2, 4, 6, 8, 9, 10, 12 };
 
        Nodevalue root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
 
        // find the ceil and floor for each key
        for (int i = 0; i < 15; i++)
        {
            FloorCeil ob = new FloorCeil();
 
            findFloorCeil(root, ob, i);
            System.out.println(i + " —> Floor is " + ob.getFloorData()
                        + ", Ceil is " + ob.getCeilData());
        }
    }
}