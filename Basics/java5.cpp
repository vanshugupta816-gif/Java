package Basics;

// **** STRING DATATYPE , HEAP STORAGE AND STRING POOL **** //
public class java6 {
    // static void generictype.main(String[] args) {
//       String name = "vanshu"; // sequence of character

    //       System.out.println(name);
    // }
//}
    public static void main(String[] args) {
        String x = "ram";
        String a = new String("x"); // stored in heap
        String b = new String("x"); // stored in heap
        String c = "ram";
        String d = "ram";
        System.out.println(a == b);
        System.out.println(c == d);

    }
}







