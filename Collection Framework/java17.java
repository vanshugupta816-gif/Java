
import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {
    static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        // hashtable is synchronized
        // no null key or value
        // legacy class, concurrent hashmap
        // slower than hashmap
        // only linked list on case of collision

        hashtable.put(1, "apple");
        hashtable.put(2, "banana");
        hashtable.put(3, "cherry");
        System.out.println(hashtable);
        System.out.println("value for key 3: " + hashtable.get(3));
        System.out.println("does key 3 exist? " + hashtable.containsKey(3));
        hashtable.remove(1);
        System.out.println("after removing key 1: " + hashtable);
//        hashtable.put(null, "value");
//        hashtable.put(4, null);

        // we cannot use hashmap because it is not synchronized
        Hashtable<Integer, String> map = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("final size of hashmap: " + map.size());
    }
}
