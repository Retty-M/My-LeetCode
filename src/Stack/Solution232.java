package Stack;

import java.util.Stack;

/**
 * Created by Retty on 2016-03-20.
 * Implement Queue using Stacks
 * 用两个栈模仿队列，即先入先出
 */
public class Solution232 {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        input.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        peek();
        output.pop();
    }

    // Get the front element.
    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return output.empty() && input.empty();
    }

}
