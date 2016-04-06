/**
 * Created by Retty on 2016-03-20.
 */
public class Solution2 {

	int carryFlag = 0;
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int num;
    	ListNode result;
    	if(l1 == null && l2 == null && carryFlag == 1) return new ListNode(1);
        if(l1 == null) {
        	if(carryFlag == 0) return l2;
        	l1 = new ListNode(0);
        }
        if(l2 == null) {
        	if(carryFlag == 0) return l1;
        	l2 = new ListNode(0);
        }
        num = l1.val + l2.val + carryFlag;
        result = new ListNode(num%10);
        carryFlag = num/10;
        result.next = addTwoNumbers(l1.next, l2.next);

        return result;
    }
    
    public int toInt(ListNode temp) {
    	int num = 0;
		for (int i = 0; temp != null; i++) {
			num += temp.val * Math.pow(10, i);
			temp = temp.next;
		}
		return num;
	}
    
    public ListNode toListNode(int num) { 
    	ListNode temp;
    	if(num/10 == 0) return new ListNode(num);
    	temp = new ListNode(num%10);
    	temp.next = toListNode(num/10);
    	return temp;
	}
	
}
