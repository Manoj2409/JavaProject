package datastructures.collectionsdatastructures.stackAndQueues.stack;


public class testStack {
    public static void main(String[] args) {
        testStack obj=new testStack();
        //obj.Constructor();
        //obj.Push();
        obj.Pop();
    }
    
    public void Constructor(){
        Stack stack1=new Stack(4);
        int peekValue=stack1.peek();
        System.out.println(peekValue);
        int heightValue=stack1.getHeight();
        System.out.println(heightValue);
    }


    public void Push() {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.printAll();
       }

    public void Pop(){
        Stack stack = new Stack(5);
        stack.push(10);
        stack.printAll();
        stack.pop();
        stack.printAll();
        stack.pop();
        System.out.println("all popped");
        stack.printAll();
    }
}
