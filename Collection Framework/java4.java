
import java.util.Comparator;
import java.util.concurrent.*;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced: " + value);
                queue.put(value++);
                Thread.sleep(500);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }
    }
}
class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}

public class BlockingQueueDemo {
    static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // a bounded , blocking queue backed by an circular array
        // low memory overhead
        // uses a single lock for both enqueue and dequeue operations
        // more threads --> problem
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();
        // optionally bounded backed by Linkedliat
        // uses two separate locks for enqueue and dequeue operation
        // higher concurrency between producers and consumers
        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // unbounded
        // binary heap as array and can grow dynamically
        // head is based on their natural ordering or a provided comparator like priority queue
        // put won't block
        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry");
        System.out.println(queue2);
    }
}
