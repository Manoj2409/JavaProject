package datastructures.collectionsdatastructures.stackAndQueues.stack;

public class Queue {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    private Node first;
    private Node last;
    private int length;
    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        if (first == null) {
            System.out.println("First: null");
        } else {
            System.out.println("First: " + first.value);
        }
    }

    public void getLast() {
        if (last == null) {
            System.out.println("Last: null");
        } else {
            System.out.println("Last: " + last.value);
        }
    }
    public void enqueue(int value){
        //adding new val
        Node temp=new Node(value);
         if(length==0){
            first=temp;
            last=temp;

        } else if (length>=1) {
            last.next=temp;
            last=temp;
        }
        length++;
    }
    public Node dequeue(){
        //removing first value
        if(length==0){
            return null;
        }
        Node temp=first;
        if(length==1){
            first=null;
            last=null;
        }
        else if(length>1){
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
