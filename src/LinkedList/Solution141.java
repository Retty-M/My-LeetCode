package LinkedList;

/**
 * Created by Retty on 2016-04-10.
 * Linked List Cycle
 * 设置两个指针，一个fast每次每次两步，一个slow每次走一步，相遇即存在环
 */
public class Solution141 {

    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
