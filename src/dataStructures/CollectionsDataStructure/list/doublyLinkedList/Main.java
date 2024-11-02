package dataStructures.CollectionsDataStructure.list.doublyLinkedList;


public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList1=new DoublyLinkedList(1);
        doublyLinkedList1.append(2);
        doublyLinkedList1.append(3);
        doublyLinkedList1.append(4);
        doublyLinkedList1.append(5);

/*      doublyLinkedList1.printAll();
        doublyLinkedList1.getHead();
        doublyLinkedList1.getTail();
        doublyLinkedList1.getLength();*/

        /*doublyLinkedList1.removeLast();
        doublyLinkedList1.removeLast();
        doublyLinkedList1.printAll();*/

        //prepend validate
       /* doublyLinkedList1.prepend(-1);
        doublyLinkedList1.printAll();*/

        //remove first
        /*doublyLinkedList1.printAll();
        for(int i=1;i<=8;i++){
            doublyLinkedList1.get(i);
        }*/

        /*System.out.println(doublyLinkedList1.length);
        doublyLinkedList1.remove(6);
        doublyLinkedList1.printAll();
        System.out.println("Length : "+doublyLinkedList1.length);
        System.out.println(3/2);*/
        doublyLinkedList1.swapPairs();
        doublyLinkedList1.printAll();
    }
}