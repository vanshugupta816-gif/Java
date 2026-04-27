import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    static void main(String[] args) {
        // set is the collection that cannot contain duplicate elements
        // faster operarion
        // Map -> hashmap , linkeshashmap , treemap , enummap
        // set -> hashset , linkedhashset , treeset , enumset
       // Set<Integer> set = new HashSet<>();
      //  Set<Integer> set = new LinkedHashSet<>();
       // Set<Integer> set = new TreeSet<>();
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(67));
        set.clear();
        System.out.println(set.isEmpty());
        for(int i: set) {
            System.out.println(i);
        }

        // for thread safety

        Set<Integer> set1 = new ConcurrentSkipListSet<>();

        Set<Integer> syncSet = Collections.synchronizedSet(new TreeSet<>());

        synchronized (syncSet) {
            for (Integer i: syncSet) {
                // safe iteration
                System.out.println(i);

            }

        }


    }
}
