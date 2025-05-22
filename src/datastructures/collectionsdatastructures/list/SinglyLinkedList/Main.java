package datastructures.collectionsdatastructures.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);

        System.out.println("LL before reverse():");
        linkedList1.printList();

        linkedList1.reverse();

        System.out.println("\nLL after reverse():");
        linkedList1.printList();

        //System.out.println("\n removing first index and printing");
        linkedList1.remove(0);

        System.out.println("\n LinkedList after removing zeroth index");
        linkedList1.printList();

        LinkedList linkedList2=new LinkedList();
        linkedList2.append(1);
        linkedList2.append(2);
        System.out.println("\nLinked List 2");
        linkedList2.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4

            LL after reverse():
            4
            3
            2
            1

        */

    }

}
