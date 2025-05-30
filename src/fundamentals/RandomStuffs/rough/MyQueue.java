package fundamentals.RandomStuffs.rough;
import java.util.Stack;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);

    }

    public Integer dequeue(){
        Integer temp;
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());

        }
        if(stack2.size()==0){
            return null;
        }
        temp= stack2.peek();
        stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return temp;
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

}