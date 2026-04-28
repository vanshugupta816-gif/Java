// sortedmap is interface and treemap its implementation and navigablemap extend sortedmap

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {


    public class SortedMapDemo1 {
        static void main(String[] args) {
            SortedMap<Integer , String> map = new TreeMap<>((a, b) -> b - a);
            map.put( 91,"vivek");
            map.put( 99,"ansh");
            map.put( 78,"vanshu");
            map.put( 95,"anaya");
            System.out.println(map);
            map.get(77);
            map.containsKey(78);
            map.containsValue(95);

            System.out.println(map.firstKey());
            System.out.println(map.lastKey());
            System.out.println(map.headMap(91)); // exclude
            System.out.println(map.tailMap(91)); // include

// if we want nearest value then we use navigable map
            NavigableMap<Integer , String> navigableMap = new TreeMap<>();
            navigableMap.put(1, "one");
            navigableMap.put(5, "five");
            navigableMap.put(3, "three");
            System.out.println(navigableMap);
            System.out.println(navigableMap.lowerKey(4));
            System.out.println(navigableMap.ceilingKey(4));
        }
    }

}
