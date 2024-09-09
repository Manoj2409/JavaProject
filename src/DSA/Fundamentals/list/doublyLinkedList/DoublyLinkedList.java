package DSA.Fundamentals.list.doublyLinkedList;

import DSA.Fundamentals.list.SinglyLinkedList.LinkedList;

public class DoublyLinkedList{
    private Node head;
    private Node tail;
    protected int length;
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }
    public DoublyLinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public DoublyLinkedList(){
        length=0;
    }
    public void append(int val){
        Node newNode=new Node(val);
        if(length==0){
            head=newNode;
        }
        else{
            newNode.prev=tail;
            tail.next=newNode;
        }
        tail=newNode;
        length++;
    }

}
