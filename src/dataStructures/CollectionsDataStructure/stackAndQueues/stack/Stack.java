package dataStructures.CollectionsDataStructure.stackAndQueues.stack;

public class Stack {
    //params in stack : height, top
    //methods in stack : push, pop, peek, print all
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
        top =newNode;
        height=1;
    }
    public void printAll(){
        Node temp= top;
        for(;temp!=null;temp=temp.next){
            System.out.println(temp.value);
        }
    }
    public void push(int value){
        Node temp=new Node(value);
        if (height != 0) {
            temp.next = top;
        }
        top =temp;
        height++;
    }
    public Node pop() {
        if(height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
        return temp;
    }

    public int peek(){
        return top.value;
    }
    public int getHeight(){
        return height;
    }
}
