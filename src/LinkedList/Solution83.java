package LinkedList;

/**
 * Created by Retty on 2016-04-15.
 * Remove Duplicates from Sorted List
 * 递归，从后往前遍历会快
 */
public class Solution83 {

    public ListNode deleteDuplicates(ListNode head) {
        // High
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;

        /* As High As Above
        if (head == null) return head;
        if (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
                deleteDuplicates(head);
            } else
            deleteDuplicates(head.next);
        }
        return head;
         */
    }

}
