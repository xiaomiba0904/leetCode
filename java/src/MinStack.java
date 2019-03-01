package LeetCode;

import java.util.*;

public class MinStack {
    private Stack<Integer> stack;
    private Deque<Integer> deque;

    public MinStack() {
        this.stack = new Stack<>();
        this.deque = new ArrayDeque<>();
    }

    public void push(int x) {
        this.stack.push(x);

        Integer min = deque.peek();
        if (min == null || x <= min) {
            deque.push(x);
        }

    }

    public void pop() {
        Integer x = stack.pop();
        if (x.equals(deque.peek())) {
            deque.pop();
        }
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.deque.peek();
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);

        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
