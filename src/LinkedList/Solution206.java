package LinkedList;

/**
 * Created by Retty on 2016-03-20.
 */
public class Solution206 {

	// 非递归
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;

		ListNode result = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = result;
			result = head;
			head = next;
		}
		
		/* Low
		if(head == null || head.next == null) return head;
		ListNode result = new ListNode(head.val);
		while(head.next != null) {
			ListNode temp = new ListNode(head.next.val);
			temp.next = result;
			result = temp;
			head = head.next;
		}*/
		
		return result;
    }

	// 递归
	public ListNode reverseList1(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode newHead = reverseList1(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
}
