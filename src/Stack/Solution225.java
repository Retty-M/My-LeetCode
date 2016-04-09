package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Retty on 2016-04-09.
 * Implement Stack using Queues
 * 用两个队列来模仿栈，即后入先出
 */
public class Solution225 {

    Queue<Integer> queue = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        int size = queue.size();
        for (int i = 1; i < size; i++)
            queue.add(queue.remove());
        queue.remove();
    }

    // Get the top element.
    public int top() {
        int size = queue.size();
        for (int i = 1; i < size; i++)
            queue.add(queue.remove());
        int temp = queue.remove();
        queue.add(temp);
        return temp;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }

}
