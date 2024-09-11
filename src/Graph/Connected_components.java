package Graph;

import java.util.ArrayList;
import java.util.Iterator;

public class Connected_components {
	/*Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), 
	 write a function to find the number of connected components in an undirected graph.

	Example 1:

	Input: n = 5 and edges = [[0, 1], [1, 2], [3, 4]]

	     0          3
	     |          |
	     1 --- 2    4   // process -> create a graph -> vertex add edge -> check visited (recursive) -> reacheable comp print

	Output: 2*/
	
	// sol -> [[0, 1], [1, 2], [3, 4],[4,6] [6,8],[6,9], count [0,2,0,0,4,0,0,0]
	int ver;
	ArrayList<ArrayList<Integer>>arrayList ;
	Connected_components(int ver)
	{	
		this.ver = ver;
		arrayList = new ArrayList<>();
		
		for (int i = 0; i < ver; i++) {
			arrayList.add(i,new ArrayList<>());
			
		}
		
	}
	void incedges(int source , int destination) {
		
		arrayList.get(source).add(destination);
		arrayList.get(destination).add(source);
		
		
		
	}
	void check(int ver, boolean[] visited) {// count[]
		// marks all the vertices true 
		visited[ver] =true;
		System.out.println(ver + " ");// print the list
		for (int i: arrayList.get(ver)) {
			if (!visited[i]) {
				check(i, visited);
				
				
			}
			
		}
	}
	void connectedcomp() {
		// visits the vertices and check if they are visited 
		// mark the not visited vertices 
		boolean[] visited = new boolean[ver];
		for(int v = 0;v<ver;v++ ) {
			if (!visited[v]) {
				
				check(v, visited);
				System.out.println();
			}
			//reach 
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		// create a graph 
		Connected_components graphComponents = new Connected_components(5);
		graphComponents.incedges(0, 1);
		graphComponents.incedges(1, 2);
		graphComponents.incedges(3, 4);
		System.out.println("the connected components are ");
		graphComponents.connectedcomp();
		
		
	}
	
	
	
}
