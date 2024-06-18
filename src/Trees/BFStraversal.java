package Trees;

import java.util.LinkedList;
import java.util.Queue;

class Nodee{
	int data;
	Nodee leftNode;
	Nodee rightNode;
	public Nodee(int item) { 
		data = item ;
		leftNode = rightNode =null;
		
	}
	
	
	
}

public class BFStraversal {
	//BFS ->  assignment -> DFT
	Nodee rootNode;
	void traversal() {
		if (rootNode == null ) {
			return;
		}
		Queue<Nodee> queue = new LinkedList<>();
		queue.add(rootNode);
		//traverse
		
		while(!queue.isEmpty()) {
			Nodee tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
			if (tempNode.leftNode != null) {
				queue.add(tempNode.leftNode);
				
			}
			if (tempNode.rightNode!=null ) {
				queue.add(tempNode.rightNode);
				
			}}
		
	}
	public static void main(String[] args) {
		
		
		BFStraversal treeBfStraversal = new BFStraversal();
		treeBfStraversal.rootNode = new Nodee(10);
		treeBfStraversal.rootNode.leftNode = new Nodee(8);
		treeBfStraversal.rootNode.rightNode = new Nodee(11);
		treeBfStraversal.rootNode.leftNode.leftNode = new Nodee(2);
		treeBfStraversal.rootNode.leftNode.rightNode = new Nodee(7);
		treeBfStraversal.rootNode.rightNode.leftNode= new Nodee(13);
		treeBfStraversal.rootNode.rightNode.rightNode= new Nodee(15);
		treeBfStraversal.rootNode.leftNode.leftNode.leftNode = new Nodee(1);
		// 1 2 7 8 10 13 15 11
		System.out.println("the breadth traversal of the tree is ");
		
		treeBfStraversal.traversal();
	}
	
	
	

}
