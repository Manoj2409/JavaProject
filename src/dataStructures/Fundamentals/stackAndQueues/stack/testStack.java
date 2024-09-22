package dataStructures.Fundamentals.stackAndQueues.stack;

import org.junit.Assert;
import org.junit.Test;

public class testStack {

    @Test
    public void Constructor(){
        Stack stack1=new Stack(4);
        int peekValue=stack1.peek();
        int heightValue=stack1.getHeight();
        Assert.assertEquals(4,peekValue);
        Assert.assertEquals(1,heightValue);
    }

    @Test
    public void Push() {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.printAll();
        Assert.assertEquals(10,stack.peek());
        Assert.assertEquals(2,stack.getHeight());
    }
    @Test
    public void pop(){
        Stack stack = new Stack(5);
        stack.push(10);
        stack.printAll();
        Assert.assertEquals(10,stack.peek());
        Assert.assertEquals(2,stack.getHeight());
        stack.pop();
        Assert.assertEquals(5,stack.peek());
        Assert.assertEquals(1,stack.getHeight());
        stack.pop();
        Assert.assertEquals(0,stack.getHeight());
    }
}
