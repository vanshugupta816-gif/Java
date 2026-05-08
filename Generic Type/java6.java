
public class main {
    static void main(String[] args) {
//        Box<Integer> box = new Box<>();// box is now type safe
//        box.setValue(1);
//        int i = box.getValue();
//        System.out.println(i);
//        int i = (Integer) box.getValue();
//        System.out.println(i);

        Pair<String, Integer> pair = new Pair<>("age", 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

    }
}
// generic types allow you to define a class , interface , or method with placeholders (type parameters) for the data type they will work with.

/*
   T: type
   E: element (used in collection)
   K: key (used in maps)
   V: value ( used in maps)
   N: number


    */
