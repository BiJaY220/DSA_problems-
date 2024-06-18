package Trees;

class Nodes{
	int data;
	Nodes leftNode ,rightNode , nextNodes;
	public Nodes(int item) { 
		data = item ;
		leftNode = rightNode =null;
		
	}
}



class Subtree {
// node define 
	Nodes rootNodes1 ,rootNodes2;
	
	boolean Identical(Nodes rootNodes1,Nodes rootNodes2) {
		if (rootNodes1 == null && rootNodes2== null ) {
			// 
			return true;
		}
		if (rootNodes1 == null || rootNodes2 == null) {
			
			//
			return false;
		}
		return (rootNodes1.data == rootNodes2.data 
				&& Identical(rootNodes1.leftNode, rootNodes2.leftNode)
				&& Identical(rootNodes1.rightNode, rootNodes2.rightNode));
		
	}
	boolean ourSubtree(Nodes A, Nodes B) {
		if (A == null) {
			return false;
			
		}
		if (B == null) {
			return true;
			
		}
		if (Identical(A, B)) {
			return true;
		}
		return ourSubtree(A.leftNode, B)
				|| ourSubtree(A.rightNode, B);
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Subtree treeBfStraversal = new Subtree();
		treeBfStraversal.rootNodes1 = new Nodes(10);
		treeBfStraversal.rootNodes1.leftNode = new Nodes(8);
		treeBfStraversal.rootNodes1.rightNode = new Nodes(11);
		treeBfStraversal.rootNodes1.leftNode.leftNode = new Nodes(2);
		treeBfStraversal.rootNodes1.leftNode.rightNode = new Nodes(7);
		treeBfStraversal.rootNodes1.rightNode.leftNode= new Nodes(13);
		treeBfStraversal.rootNodes1.rightNode.rightNode= new Nodes(15);
		treeBfStraversal.rootNodes1.leftNode.leftNode.leftNode = new Nodes(1);
		//System.out.println("the tree to check ");
		treeBfStraversal.rootNodes2 = new Nodes(11);
		treeBfStraversal.rootNodes2.rightNode = new Nodes(15);
		treeBfStraversal.rootNodes2.leftNode = new Nodes(13);
		treeBfStraversal.rootNodes2.leftNode.leftNode = new Nodes(7);
		
		//treeBfStraversal.rootNodes2 = new Nodes(13);
		if (treeBfStraversal.ourSubtree(treeBfStraversal.rootNodes1, treeBfStraversal.rootNodes2)) {
			System.out.println("the second tree is the subtree of the first tree");
		}else {
			System.out.println("not the subtree");
		}
	}
	
}
