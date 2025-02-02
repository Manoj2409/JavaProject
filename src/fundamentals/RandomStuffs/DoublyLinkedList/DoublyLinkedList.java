package fundamentals.RandomStuffs.DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
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
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
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
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }
    public void reverse(){

        Node temp1=head;
        Node temp2=tail;
        int tempValue=0;
        for(int counter=0;counter<length/2;temp1=temp1.next,temp2=temp2.prev){
            tempValue=temp1.value;
            temp1.value=temp2.value;
            temp2.value=tempValue;
            //swap function
            counter++;
        }
    }
    public boolean palindrome(){

        Node temp1=head;
        Node temp2=tail;
        for(int counter=0;counter<length/2;temp1=temp1.next,temp2=temp2.prev){
            if(temp1.value!=temp2.value){
                return false;
            }
            //swap function
            counter++;
        }
        return true;
    }
    public void swapPairs(){
        //check whether the next two iteration is a pair or not
        //3 types of check and logics for individual things
        //:)
        if(length<=1){
            return;
        }
        Boolean firstPrev=false,pairs=false,secondNext=false;
        Node firstValue=head;
        Node secondValue=head.next;
        pairs=true;
        for(int i=0;i<length/2;i++){
            //pairs
            //first pair approach
            Node thirdValue=secondValue.next;
            if(firstPrev==false && thirdValue != null){
                secondValue.next=firstValue;
                secondValue.prev=secondValue;
                firstValue.prev=secondValue;
                firstValue.next=thirdValue;
                thirdValue.prev=firstValue;
                head=secondValue;
                firstPrev=true;
            } else if (firstPrev==false && thirdValue==null) {
                secondValue.next=firstValue;
                firstValue.next=null;
                firstValue.prev=secondValue;
                secondValue.prev=secondValue;
                head=secondValue;
                firstPrev=true;
            } else if(firstPrev== true && thirdValue==null){
                Node prevValue=firstValue.prev;
                prevValue.next=secondValue;
                secondValue.next=firstValue;
                secondValue.prev=prevValue;
                firstValue.prev=secondValue;
                firstValue.next=null;
                tail=firstValue;
            }else if(firstPrev== true && thirdValue!=null){
                Node prevValue=firstValue.prev;
                prevValue.next=secondValue;
                secondValue.next=firstValue;
                secondValue.prev=prevValue;
                firstValue.prev=secondValue;
                firstValue.next=thirdValue;
                thirdValue.prev=firstValue;
            }

            if(firstValue.next!=null && firstValue.next.next!=null){
                firstValue=firstValue.next.next;
                secondValue=secondValue.next.next;
                //reassign
                Node temp=firstValue;
                firstValue=secondValue;
                secondValue=temp;
            }else{
                return;
            }

        }

    }



}

