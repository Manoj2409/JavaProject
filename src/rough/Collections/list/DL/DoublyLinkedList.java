package rough.Collections.list.DL;

public class DoublyLinkedList {
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

}
