package fundamentals.RandomStuffs.rough;

public class Main {

    public static void main(String[] args) {

        // Create a new queue
        MyQueue q = new MyQueue();

        // Enqueue some values
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        // Output the front of the queue
        System.out.println("Front of the queue: " + q.peek());

        // Dequeue some values
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        // Enqueue another value
        q.enqueue(4);

        // Output the front of the queue again
        System.out.println("Front of the queue: " + q.peek());

        // Dequeue all remaining values
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());

        // Dequeue from an empty queue and check if it returns null
        System.out.println("Dequeued value from empty queue: " + q.dequeue());


        /*
            EXPECTED OUTPUT:
            ----------------
            Front of the queue: 1
            Dequeued value: 1
            Dequeued value: 2
            Front of the queue: 3
            Dequeued value: 3
            Dequeued value: 4
            Is the queue empty? true
            Dequeued value from empty queue: null
        */

    }

}