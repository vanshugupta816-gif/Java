

import java.util.*;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
    return o1.length() - o2.length();
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class testT {
    static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        List<Integer> list3 = List.of(1, 2, 3, 4);
//        list3.set(1, 33);

        list.add(1);
        list.add(2);
        list.add(3);
//        list.add(0 , 0);
        Collections.sort(list);
        list.sort(new MyComparator());

        Object[] array = list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]);

        list.remove(Integer.valueOf(1));
        System.out.println(list);

        List<String> words = Arrays.asList("banana" , "apple" , "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);

//        List<Integer> list5 = List.of(4, 5, 6, 7, 8, 9);
//        list.addAll(list5);
//        System.out.println(list5);



    }
}
