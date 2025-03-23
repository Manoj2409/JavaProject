package fundamentals.RandomStuffs.DoublyLinkedList;
public class Main {

    public static void main(String[] args) {

        DoublyLinkedList myDll = new DoublyLinkedList(1);
        myDll.append(2);
       // myDll.append(3);
        //myDll.append(4);

        System.out.println("myDll before swapPairs:");
        myDll.printList();
        myDll.swapPairs();
        System.out.println("\nmyDll after swapPairs:");
        myDll.printList();

        System.out.println("Head : "+myDll.getHead().value+'\n'+"Length : "+myDll.getLength()+'\n'+ myDll.getHead().next.next);


        /*
            EXPECTED OUTPUT:
            ----------------
            myDll before swapPairs:
            1 <-> 2 <-> 3 <-> 4

            myDll after swapPairs:
            2 <-> 1 <-> 4 <-> 3

        */

    }

}