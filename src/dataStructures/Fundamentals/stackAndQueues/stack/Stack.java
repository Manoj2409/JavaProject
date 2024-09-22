package dataStructures.Fundamentals.stackAndQueues.stack;

public class Stack {
    //constructor,push,pop,peek
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    private Node top;
    private int height;

    public Stack(int value){
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }
    public void printAll(){
        Node temp=top;
        for(;temp!=null;temp=temp.next){
            System.out.println(temp.value);
        }
    }
    public void push(int value){
        Node temp=new Node(value);
        if(height==0){
            top=temp;
        }else{

            temp.next=top;
            top=temp;
        }
        height++;
    }
    public Node pop(){

        if(height==0){
            System.out.println("Check the height before pop from Stack"+Stack.class);
            return null;
        }
        else if(height==1){
            top=null;
            height=0;
        }
        else{
            top=top.next;
            height--;
        }
        return top;
    }

    public int peek(){
        return top.value;
    }
    public int getHeight(){
        return height;
    }
}
