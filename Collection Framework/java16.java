
import java.util.*;

public class HashMapDemo {
    static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(1, "Ansh");
        map.put(2, "Vanshu");
        map.put(3, "Anaya");
        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);
        String s = map.get(69);
        System.out.println(s);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Ansh"));

        for(int i :  map.keySet()) {
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer , String>> entries = map.entrySet();

        for (Map.Entry<Integer , String> entry :entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        // map removed
        map.remove(2);
        System.out.println(map);

        List<Integer> list = Arrays.asList(2, 4, 32, 43, 4, 432);
        list.contains(32);

    }
}
