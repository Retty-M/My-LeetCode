/**
 * Created by Retty on 2016-03-20.
 */
import java.util.ArrayList;
import java.util.List;

public class Solution234 {
	
	public boolean isPalindrome(ListNode head) {
		if(head == null) return true;
		List<ListNode> temp = new ArrayList<>();
        while(head != null) {
        	temp.add(new ListNode(head.val));
        	head = head.next;
        }
        int size = temp.size();
        for (int i = 0; i < size/2; i++) {
			if(temp.get(i) != temp.get(size-i-1)) return false;
		}
        return true;
    }
	
}
