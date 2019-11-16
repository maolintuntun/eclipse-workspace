package mergeTwoList;

//method1 iterative.set a prehead,prev, processing the element 1by1
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}
public class Solution {
	public ListNode mergeTwoList(ListNode l1, ListNode l2) {
		ListNode prehead = new ListNode(0);
		ListNode prev = prehead;
		
		while(l1!=null && l2!=null) {
			if(l1.val<l2.val) {
				prev.next = l1;
				l1 = l1.next;
				
				
			}else if(l1.val>=l2.val){
				prev.next = l2;
				l2 = l2.next;
				
			}
			prev = prev.next;
		}
		prev.next = (l1 == null)? l2:l1;
		return prehead.next;
	}

}
