package dataStructures.CollectionsDataStructure.Heap;

public class testHeap {
    public static void main(String[] args) {
        heap heap1=new heap();
        /*heap1.insert(99);
        heap1.insert(72);
        heap1.insert(61);
        heap1.insert(58);
        System.out.println(heap1.getHeap());
        heap1.insert(100);
        System.out.println(heap1.getHeap());*/
        heap1.insert(95);
        heap1.insert(75);
        heap1.insert(80);
        heap1.insert(55);
        heap1.insert(60);
        heap1.insert(50);
        heap1.insert(65);

        System.out.println(heap1.getHeap());
        heap1.remove();
        System.out.println(heap1.getHeap());
    }
}
