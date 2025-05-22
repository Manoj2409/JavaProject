package datastructures.collectionsdatastructures.stackAndQueues.stack;

public class testQueue {
    public static void main(String[] args) {
        Queue queue=new Queue(10);
        queue.printQueue();
        queue.getFirst();
        queue.getLast();
        queue.enqueue(3);
        queue.printQueue();
        queue.dequeue();
        System.out.println("After dequeue :");
        queue.printQueue();
    }
}
