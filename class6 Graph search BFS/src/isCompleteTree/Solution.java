package isCompleteTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public boolean isComplete(TreeNode root) {
		if(root == null) {
			return false;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		boolean flag = false;
		q.offer(root);
		while(!q.isEmpty()) {
			TreeNode cur = q.poll();
			if(cur.left == null) {
				flag = true;
			}else if(flag == true) { //why? because only if left or right child is null would cause flag to be trye.
				                    // this means there was some previous child was null.
				return false;
			}else {
				q.offer(cur.left);
			}
			
			if(cur.right == null) {
				flag = true;
			}else if(flag == true) {
				return false;
			}else {
				q.offer(cur.right);
			}
			
		}
		return true;
		
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
