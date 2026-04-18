

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    static void main(String[] args) {
        // thread safe
        // copy on write mechanism
        // no duplicate elements
        // iterators do not reflect modification

        CopyOnWriteArraySet<Integer> copyonwriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for(int i = 1; i <= 5; i++) {
            copyonwriteSet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial CopyOnWriteArraySet: " + copyonwriteSet);
        System.out.println("Intial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\nIterating and modifing CopyOnWriteArraySet:");
        for(Integer num : copyonwriteSet ){
            System.out.println("reading from copyonwritearrayset: " + num);
            // attempting to modify the set during iteration
            copyonwriteSet.add(6);
        }
        System.out.println(copyonwriteSet);

        System.out.println("\nIterating and modifing ConcurrentSkipListSet:");
        for(Integer num : copyonwriteSet ){
            System.out.println("reading from concurrentskiplistset: " + num);
            // attempting to modify the set during iteration
            concurrentSkipListSet.add(6);
        }
        System.out.println(concurrentSkipListSet);
    }
}
