
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    static void main(String[] args) {
        // non-blocking, thread-safe double-ended queue
        // CAS
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("element1");
        deque.addFirst("element0");
        deque.addLast("element2");
        System.out.println(deque);
    }
}
