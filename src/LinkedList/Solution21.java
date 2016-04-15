package LinkedList;

import LinkedList.ListNode;

/**
 * Created by Retty on 2016-03-20.
 * Merge Two Sorted Lists
 * 遍历比l1和l2的值
 */
public class Solution21 {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
	
}
