package fundamentals.RandomStuffs.DoublyLinkedList;
public class DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
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
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
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
            newNode.prev = current;
        }
        length++;
    }

    // WRITE THE SWAPPAIRS METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////

    public void swapPairs() {
    if(length==0|| length==1){
        return;
    }
        //create 4 variables and initial setup
        Node beforePair,afterPair=head.next.next,firstValue=head,secondValue=head.next;
        Node newNode=new Node(0);
        firstValue.prev=newNode;
        beforePair=firstValue.prev;
        head=head.next;

        for(;;){
            //changing stuffs
            beforePair.next=secondValue;
            firstValue.next=afterPair;
            firstValue.prev=secondValue;
            secondValue.prev=beforePair;
            secondValue.next=firstValue;

            //
            beforePair=firstValue;
            if(beforePair.  next!=null){
                firstValue=beforePair.next;
                firstValue.prev=beforePair;
            }else{
                break;
            }
            if(beforePair.next.next!=null){
                firstValue=beforePair.next;
                secondValue=firstValue.next;
                afterPair=secondValue.next;
            }else{
                break;
            }
        }
        head.prev=null;
    }
}

