package dataStructures.CollectionsDataStructure.list.doublyLinkedList;


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
    public void append(int value){
        Node newNode=new Node(value);

        if (length == 0) {
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        length++;
    }
    public void printAll(){
        Node temp=head;
        for(;temp!=null;temp=temp.next){
            System.out.println(temp.value);
        }
        System.out.println();
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }
    public void getLength() {
        System.out.println("Length: " + length);
    }

    public Node removeLast(){
        Node temp=head;
        Node end=tail;
        if(length==0) return null;
        else if (length==1) {
            head=null;
            tail=null;
        }else{
            tail=end.prev;
            tail.next=null;
            end.prev=null;
        }
        length--;
        return temp;
    }

    public void prepend(int val){
        Node temp=head;
        Node newNode=new Node(val);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            temp.prev=newNode;
            newNode.next=temp;
            head=newNode;
        }
        length++;
    }
    public Node removeFirst(){
        Node temp=head;
        if(length==0) return null;
        else if(length==1){head=null; tail=null;}
        else {head=head.next; temp.next=null; head.prev=null;}
        length--;
        return head;
    }
    public Node get(int index){
        Node temp=head;
        if(index>=length || index<0){
            System.out.println("Enter the index within the range from get method");
        }
        if(index<=length/2){
            for(int i=0;i<=length/2;i++,temp=temp.next){
                if(index==i){
                    //System.out.println(temp.value);
                    return temp;
                }
            }
        }
        else{
            temp=tail;
            for(int i=length-1;i>=length/2;i--,temp=temp.prev){
                if(index==i){
                    //System.out.println(temp.value);
                    return temp;
                }
            }
        }
        //System.out.println("Something your fault! \nAnd just enter the values within bounds");
        return null;
    }

    public boolean set(int index,int value){
        if(index<0 && index>length-1){
            System.out.println("Enter the index within the bounds");
        }
        //what I need
        //iterate to that particular index
        Node newNode=get(index);
        if(newNode!=null){
            newNode.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value){
        if(index<0 || index>length){
            System.out.println("Enter the index within the bounds insert");
            return false;
        }
        if(index==0){
            prepend(value);
        } else if (index==length) {
            append(value);
        }
        else {
            Node right=get(index); //ptr1
            Node left=right.prev;  //ptr2
            Node temp=new Node(value);
            temp.next=right;
            temp.prev=left;
            left.next=temp;
            right.prev=temp;
            length++;
        }
        return true;
    }
    public Node remove(int index){
        if(index<0 || index>=length){
            System.out.println("Index out of bounds remove\n"+ DoublyLinkedList.class);
            return null;
        }
        if(index==0){
            return removeFirst();
        }
        if(index==length-1){
            return removeLast();
        }
        else{
            Node middle=get(index);
            Node left=middle.prev;
            Node right=middle.next;
            middle.next=null;
            middle.prev=null;
            left.next=right;
            right.prev=left;
            length--;
            return middle;
        }
    }
    public void swapPairs(){
        //edge case
        if(length==0 || length==1){
        }
        else if(length>=2){
            Node temp1=head;
            Node temp2=head.next;
            int n1=0,n2=0,counter=0;
            for(;counter<(length/2);){
                ++counter;
                //swap happens
                n1=temp1.value;
                n2=temp2.value;
                temp1.value=n2;
                temp2.value=n1;
                if(temp2.next!=null){
                    temp1=temp1.next.next;temp2=temp2.next.next;
                }
            }
        }
    }

}
