package LinkedList;

/**
 * Created by Retty on 2016-03-20.
 * Intersection of Two Linked Lists
 * http://blog.csdn.net/zzran/article/details/7984870
 * 1、本题默认链表无环，所以只能是Y形相交，将两个链表合在一起就一定能找到相交的地方
 * 2、如果一个有环一个没有，一定不会相交
 * 3、两个都有环，分两种情况：
 * 3.1、入口点相同：即相交的点在入口处或入口处之前，从头按单链表判断即可
 * 3.2、入口点不同：如果相交那么两个入口点都可以作为交点，否则不相交
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
