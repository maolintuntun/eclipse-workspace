package preorderTraversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


class TreeNode {
	    public int key;
	    public TreeNode left;
	    public TreeNode right;
	    public TreeNode(int key) {
	      this.key = key;
	    }
}
	  


public class PreOrder
{	// why list here? because return value is a list ? preorder is actually a list
	public List<Integer> preOrder( TreeNode root )                      // 这里是preOreder
	{
		List<Integer> preorder = new ArrayList<Integer>();              // 这里是preorder 不一样
		if ( root == null ) 
		{
			return preorder;                                          // 返回的是一个list
		}
		Deque<TreeNode> stack = new LinkedList<TreeNode>();          // 创建一个stack
		stack.offerFirst( root );                                                         //最先推入一个节点
		while ( !stack.isEmpty() )
		{
			TreeNode cur = stack.pollFirst() ;             // not poll() , not offer()
			if ( cur.right != null )
			{
				stack.offerFirst( cur.right );
			}
			if ( cur.left != null )
			{
				stack.offerFirst( cur.left );
			}
			preorder.add( cur.key );
		}
		return preorder;
	}
}


