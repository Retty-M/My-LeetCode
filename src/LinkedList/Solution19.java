package LinkedList;

/**
 * Created by Retty on 2016-04-09.
 * Remove Nth Node From End of List
 * 删除链表倒数第n个节点
 */
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) return head;
        ListNode l1 = head;
        ListNode l2 = head;
        int num = 0;
        while (l1 != null) {
            l1 = l1.next;
            num++;
            if (num > n+1) {
                l2 = l2.next;
            }
        }
        if (num > n) l2.next = l2.next.next;
        else if(num == n) return l2.next;
        return head;
    }

}
