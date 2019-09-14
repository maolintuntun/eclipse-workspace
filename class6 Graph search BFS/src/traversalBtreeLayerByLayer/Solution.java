package traversalBtreeLayerByLayer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> layerByLayer( TreeNode root ) {
		//we totally have 2 list . 
		// This is the first list
		List< List<Integer>> total = new ArrayList<List<Integer>>();
		if ( root == null ){
			return total;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			
			// second list: the list store all the nodes on cur level.
			List<Integer> curLayer = new ArrayList<Integer>();
			
			
			int size = queue.size();
			
			for(int i = 0;i < size; i++) {
				TreeNode cur = queue.poll();
				curLayer.add(cur.key);
				if(cur.left != null) {
					queue.offer(cur.left);
				}
				if(cur.right != null) {
					queue.offer(cur.right);
				}
			}
			total.add(curLayer);
		}
		return total;
			
		}
}

class TreeNode {
	    public int key;
	    public TreeNode left;
	    public TreeNode right;
	    public TreeNode(int key) {
	      this.key = key;
	    }
	 }
