
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
        // map.put("c", 3);
        Map<String, Integer> map3 = Map.of("ansh", 98, "vanshu", 89);
        map3.put("anaya", 88);

    }
}
