import enumDemo.Day;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    static void main(String[] args) {
        // array of size same as enum
        // [_,"gym",_,_,]
        // ordinal/index is used
        // faster than hashmap
        // memory efficient
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "gym");
        map.put(Day.MONDAY, "walk");
        String s = map.get(Day.TUESDAY);
        System.out.println(map);
    }
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
