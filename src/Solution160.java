/**
 * Created by Retty on 2016-03-20.
 */
public class Solution160 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
		ListNode A = headA;
		ListNode B = headB;
		while (A != B) {
			A = A.next;
			B = B.next;
			if (A == B) return A;
			if(A == null) A = headB;
			if(B == null) B = headA;
		}
		return A;
    }
	
}
