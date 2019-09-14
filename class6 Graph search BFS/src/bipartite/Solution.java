package bipartite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public boolean isBipartite(List<GraphNode> graph) {
		HashMap<GraphNode, Integer> visited = new HashMap<GraphNode, Integer>();
		
		for(GraphNode node:graph) {
			if(!BFS(node, visited)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean BFS(GraphNode node, HashMap<GraphNode, Integer> visited) {
		//if this node has been traversed, no need to do BFS again
		if(visited.containsKey(node)) {   //visited shi shen me?
			return true;
		}
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		queue.offer(node);
		// begin bfs from the node, since the node hasn't been visited, 
		//we can assign it to either of the group, Group0 here
		
		visited.put(node, 0);  // put a node named 'node' into '0'group in hashmap 'visited'
		
		while(!queue.isEmpty()) {
			GraphNode cur = queue.poll();
			int curGroup = visited.get(cur);// visited is a hashmap
			
			int neiGroup = curGroup == 0 ? 1:0;
			for(GraphNode nei:cur.neighbors) {
				if(!visited.containsKey(nei)) {
					visited.put(nei, neiGroup);
					
					queue.offer(nei);
				} else if(visited.get(nei) != neiGroup) {
					return false;
				}
			}
		}
		return true;
		
	}

}

class GraphNode {
	    public int key;
	    public List<GraphNode> neighbors;
	    public GraphNode(int key) {
	      this.key = key;
	      this.neighbors = new ArrayList<GraphNode>();
	    }
	  }
