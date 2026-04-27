import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

       // System.out.println(queue1.remove()); // throw exception if empty
        System.out.println(queue1.poll());

       // System.out.println(queue1.element()); // throw exception if empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
//        queue2.add(1);
//        queue2.offer(2);
        System.out.println(queue2.add(1)); // true
        System.out.println(queue2.offer(2)); // true

       // queue2.add(3); // throw exception
        System.out.println(queue2.offer(3)); // flase


    }
}
