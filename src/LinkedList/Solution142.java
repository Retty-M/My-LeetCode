package LinkedList;

/**
 * Created by Retty on 2016-04-10.
 * Linked List Cycle II
 * 返回循环链表的起点，从相交的点开始fast和slow都各走一步，
 * 到下一次相交就是链表循环的入口
 */
public class Solution142 {

    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) {
                isCycle = true;
                break;
            }
        }
        if (isCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }else return null;
    }

}
