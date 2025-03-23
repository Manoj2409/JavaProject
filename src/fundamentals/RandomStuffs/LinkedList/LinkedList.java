package fundamentals.RandomStuffs.LinkedList;
import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }
    public void reverseBetween(int m, int n){
        //handle scenarios: if ll is empty or one element
        //if the difference between m and n is zero just return
        if(length==0 || length==1 || n-m==0 || head==null){
            return;
        }
        //add a dummy node
        Node dummyNode=new Node(0);
        dummyNode.next=head;
        Node previousNode=dummyNode;
        //(0,1)
        // 0 -> 1 -> 2 -> 3
        //iterating to get m
        for(int c=0;c<m;c++){
            previousNode=previousNode.next;
        }
        Node current=previousNode.next;
        for(int counter=0;counter<n-m;counter++){

            Node nodeToMove=current.next;
            current.next=nodeToMove.next;
            nodeToMove.next=previousNode.next;
            previousNode.next=nodeToMove;
        }
        head=dummyNode.next;
    }

}