package Trees;


class node {
	// defination of node 
	node leftNode , rightNode;
	int data;
	public node(int value){
		data = value;
		leftNode =rightNode = null; 
	}
	
	
	
}

class HeightofTree {
	node rootNode;
	// method 
	int maxHeight(node node) {
		if (node == null) {
			return 0;
		}
		else {
			int leftheight = maxHeight(node.leftNode);
			System.out.println("the values in left side of root node:"+leftheight);
			int rightheight = maxHeight(node.rightNode);
			System.out.println("the values in right side of root node:"+rightheight);
			
			if (leftheight>rightheight) {
				return (leftheight+1);
			}else {
				return (rightheight+1);
			}
			
			
		}}
	
	public static void main(String[] args) {
		
		HeightofTree tree = new HeightofTree();
		
		tree.rootNode = new node(2);
		tree.rootNode.leftNode = new node(3);
		tree.rootNode.rightNode = new node(7);
		tree.rootNode.leftNode.leftNode = new node(4);
		tree.rootNode.rightNode.leftNode = new node(6);
		tree.rootNode.leftNode.rightNode = new node(5);
		tree.rootNode.rightNode.rightNode = new node(8);
		tree.rootNode.leftNode.rightNode.leftNode = new node(10);
		
		System.out.println("the height of the tree is :"+tree.maxHeight(tree.rootNode));
		
	}
	
	
	
	

}
