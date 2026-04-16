
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    static void main(String[] args) {
       ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

       // java 7 -> segment based locking --> 16 segment --> smaller hashmap
       // only the segment being written to or read from is locked
       // read: do not require locking unless there is a write operation happening on the same segment
       // write: lock

       // java 8 --> no segmentation
       //        --> compare and swap approach --> no locking except resizing or collision
       // thread a last saw --> x = 45
       // thread a work --> x to 50
       // if x is still 45, then change it to 50 else do not change and retry
       // put --> index

       // MAP --> SORTED --> THREAD SAFE --> concurrent skip list map
    }
}
