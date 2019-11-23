package removeEvenLinkedlist;
// remove even node in a single linkedlist 

class Test2 {                                             //写这个测试花了很久
	public static void main(String[] args){
		int[] array = {1,2,3,3,4,4,5,1};                //用这个办法生成链表的方式值得记忆
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		for(int i = 1; i < array.length; i++){
			cur.next = new ListNode(array[i]);
			cur  = cur.next;
		}
			
		Solution2 sol = new Solution2();
		ListNode newhead = sol.remove(head);   
        cur = newhead;                           
                       
		while(cur!=null){            
			System.out.print(cur.val + " ");
			cur = cur.next;			
		}
		
	}
}

class ListNode {
     int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solution2 {
	public ListNode remove(ListNode head)
	{

	if( head == null )
	{
		return head;
	}
	
	ListNode dummy = new ListNode(0);
	dummy.next = head;
	ListNode prev = dummy;

	while( prev.next != null )
	{	
	
		if( prev.next.val % 2 == 0){
		// delete prev.next: jump cur and point the node previous to cur to the one next cur 
			prev.next = prev.next.next;
		} else {
			prev = prev.next;	
		}
			
	}
	prev.next = null;
	return dummy.next;
   }
}
