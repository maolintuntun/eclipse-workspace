package reverseLinkedListRecursion;
//reverse in pairs
public class ReverseLinkedList {
	ListNode reverseLinkedList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseLinkedList(head.next.next);
		
		//node1 node2 reverse
		// define node2 as next
		ListNode next = head.next;
		// make node1 point to newHead4
		head.next= newHead;
		//point node2 to node1
		next.next = head;
		return next;
		
		
	}

}
class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value){
		this.value = value;
		next = null;
	}
}