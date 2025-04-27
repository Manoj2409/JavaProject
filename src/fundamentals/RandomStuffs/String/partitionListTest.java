package fundamentals.RandomStuffs.String;

public class partitionListTest {
    public static void main(String[] args) {
        LinkedList linkedList1=new LinkedList(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);
        linkedList1.append(5);

        linkedList1.printList();
        System.out.println("  ");
        //int something=linkedList1.binaryToDecimal();
        //System.out.println(something);
        linkedList1.reverseBetween(1,3);
        //linkedList1.printList();
        linkedList1.printList();
    }

}
