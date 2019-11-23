// remove even node in circle linkedlist
package linkedlist;

class Test {                                             //写这个测试花了很久
	public static void main(String[] args){
		int[] array = {13,1,3,9,13,5,2};                //用这个办法生成链表的方式值得记忆
		ListNode head = new ListNode(array[0]);
		ListNode cur = head;
		for(int i = 1; i < array.length; i++){
			cur.next = new ListNode(array[i]);
			cur  = cur.next;
		}
		cur.next = head;
		
		/*
		 * Solution sol = new Solution(); ListNode newhead = sol.removeEvenNode(head);
		 * cur = newhead;
		 */       
		
		cur = head;
                      
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


  public class Solution { public ListNode removeEvenNode( ListNode head) {
  
  ListNode dummy = new ListNode(0); dummy.next = head; ListNode prev = dummy;
  
  // for record steps and stop condition
  
  if( head == null || head.next == null) { return null; } if( head.val %2 ==0)
  { prev.next = prev.next.next;
  
  }else { prev = prev.next; } while( prev.next != head ) { // if cur is even
  if( prev.next.val % 2 == 0){ // delete prev.next: jump cur and point the node
  previous to cur to the one next cur prev.next = prev.next.next; } prev =
  prev.next;
  
  } return dummy.next; } }
 
