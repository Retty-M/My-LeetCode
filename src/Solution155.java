/**
 * Created by Retty on 2016-03-20.
 */
import java.util.Stack;

public class Solution155 {
	
	Stack<Long> min;
	Stack<Long> stack;
	
	public Solution155() {
		min = new Stack<>();
		stack = new Stack<>();
	}
	
	public void push(int x) {
		if(stack.isEmpty()) {
			min.push((long)x);
			stack.push(0L);
		}else {
			stack.push(x - min.peek());
			if(x < min.peek()) min.push((long)x);
		}
		
    }

    public void pop() {
    	if(stack.isEmpty()) return;
        long pop = stack.pop();
        if(pop < 0) min.pop();
    }

    public int top() {
        long peek = stack.peek();
        if (peek > 0) {
			return (int)(peek + min.peek());
		} else {
			return min.peek().intValue();	
		}
    }

    public int getMin() {
        return min.peek().intValue();
    }
    
}
