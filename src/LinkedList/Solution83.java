package LinkedList;

/**
 * Created by retty on 16/4/10.
 * Remove Duplicates from Sorted List
 * 递归调用的效率较低,迭代其实是指针的应用
 */
public class Solution83 {

    public ListNode deleteDuplicates(ListNode head) {

        // 递归
        if (head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;

        /* 迭代
        ListNode list = head;
        while(list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;*/
    }

}
