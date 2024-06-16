package rough.Collections.list;

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
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.next = node2;
        node2.next = node3;

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

}

