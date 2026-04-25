
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f, true) ; // double linked list --> jo sari entries ko apne andr rakhti h jisme hmne di hui hoti h
        linkedHashMap.put("orange", 10);
        linkedHashMap.put("apple", 20);
        linkedHashMap.put("guava", 13);

        linkedHashMap.get("apple");
        linkedHashMap.get("orange");

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String , Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("ansh" , 91);
        hashMap.put("vanshu" , 80);
        hashMap.put("ladu" , 78);

        Integer res = hashMap.getOrDefault("ansh", 0);
        hashMap.putIfAbsent("ansh", 92);
        hashMap.put("ansh", 92);
        System.out.println(hashMap);
        System.out.println(res);


    }
}
// linked hash map thread safe nahi hota

