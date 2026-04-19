import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    static void main(String[] args) {
        Deque<Integer>  deque1 = new ArrayDeque<>(); // faster iteration , low memory , no null allowed
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        // 5, 10, 20, 25
        System.out.println("first element: " + deque1.getFirst()); // output 5
        System.out.println("last element: " + deque1.getLast()); // output 25
        deque1.removeFirst(); // remove 5
        deque1.pollLast(); // removes 25
        // current deque: [10, 20]
        for(int num: deque1) {
            System.out.println(num);
        }

        Deque<Integer> deque2 = new LinkedList<>(); // insertion , deletion somewhere in middle
    }
}
