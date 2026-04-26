import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K , V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("bob" , 99);
        studentMap.put("ansh" , 89);
        studentMap.put("vanshu" , 91);
       // studentMap.get("bob" , 100); // isse an ansh remove ho jayega
        // studentMap.put("bob" , 100); // tan bhi same ansh remove hoga
        studentMap.put("ram" , 89);
        System.out.println(studentMap);

    }


}
