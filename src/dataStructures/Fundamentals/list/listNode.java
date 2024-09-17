package dataStructures.Fundamentals.list;

import java.util.LinkedList;
import java.util.List;

public class listNode {
    private Node head;
    private Node tail;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Node node1 = new Node(3);
       // Node node2 = new Node(2);
       // Node node3 = new Node(0);
       // Node node4 = new Node(-4);
        node1.next = null;
       // node2.next = node1;
        //node3.next=node4;
        //node4.next=node2;

        listNode obj=new listNode();
        System.out.println(obj.hasCycle(node1));
        //obj.printAllNodesValues(node1);


        //3,2,0,-4
       /* // Traversing the linked list and printing the values
        System.out.println("Linked List:");
        Node current = node1;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        // Output: 10 20 30
        // Adding a new node: 15 -> 20 -> 30
        Node newNode = new Node(15);
        newNode.next = node2;
        node1.next = newNode;
        // Traversing the updated linked list
        System.out.println("Updated Linked List:");
        current = node1;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        // Output: 10 15 20 30
        // Removing a node: 10 -> 15 -> 30
        node1.next = newNode.next;
        // Traversing the modified linked list
        System.out.println("Modified Linked List:");
        current = node1;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }*/
        // Output: 10 20 30
    }
    public void printAllNodesValues(Node nodeHead){
        for(Node current=nodeHead;current!=null;current=current.next){
            System.out.println(current.value);
        }
    }
    public boolean hasCycle(Node nodeHead){
        List<Integer> list=new LinkedList<>();

        for(Node current=nodeHead;current.next!=null;current=current.next){
            System.out.println(current.value);
            if(list.contains(current.value)){
              return true;
          }
            list.add(current.value);
        }
        return false;
    }

}

