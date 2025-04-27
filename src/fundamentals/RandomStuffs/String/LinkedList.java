package fundamentals.RandomStuffs.String;
import java.util.HashSet;



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
        if (head == null) {
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

    public void removeDuplicates() {
        if(length==0 || length==1)return;
        if(length==2){
            if(head.value!=head.next.value){
                return;
            }else{
                head.next=null;
            }
        }
        // Your implementation goes here
        Node pointer1=head;
        Node pointer2=head.next;
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(pointer1.value);
        for(;pointer2!=null;pointer2=pointer2.next){
            if(hashSet.contains(pointer2.value)){
                if(pointer2.next==null){
                    pointer1.next=null;
                }
                length--;
            }else{
                hashSet.add(pointer2.value);
                pointer1.next=pointer2;
                pointer1=pointer2;
            }
        }
    }
    public int binaryToDecimal(){
        Node temp=head;
        int total=0;
        for(;temp!=null;){
            total=total*2;
            total=total+temp.value;
            temp=temp.next;
        }
        return total;
    }
    public void reverseBetween(int start_index, int end_index) {
       /* // Your implementation here
        int startValueIndex=start_index,endValueIndex=end_index;
        Node pointer1=head,pointer2=head;
        //reach the startValue index
        int temp=startValueIndex;
        for(;temp!=0;temp--){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        for(;startValueIndex<=endValueIndex;startValueIndex++,endValueIndex--,pointer1=pointer1.next){
            pointer2=pointer1;
            //number of times to iterate the pointer 2
            temp=endValueIndex-startValueIndex;
            for(;temp!=0;temp--){
                pointer2=pointer2.next;
            }
            swap(pointer1,pointer2);
        }*/
        Node newNode=new Node(0);
        newNode.next=head;
        //now print ll
        /*for(Node temp=newNode;temp!=null;temp=temp.next){
            System.out.println(temp.value);
        }*/
        // to find the previous node
        Node previous=newNode;
        for(int counter=0;counter<start_index;counter++){
            previous=previous.next;
        }
        Node currentNode=previous.next;
        //System.out.println("Previous value : "+previous.value);
        for(int counter=0;counter<end_index-start_index;counter++){
            Node movingNode=currentNode.next;
            currentNode.next=movingNode.next;
            movingNode.next=previous.next;
            previous.next=movingNode;
        }

    }
    public void swap(Node node1,Node node2){
        int temp=node1.value;
        node1.value=node2.value;
        node2.value=temp;
    }

}