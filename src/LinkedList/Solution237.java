package LinkedList;

/**
 * Created by Retty on 2016-04-09.
 */
public class Solution237 {

    public void deleteNode(ListNode node) {
        if(node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
