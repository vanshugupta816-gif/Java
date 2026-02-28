// **** DATA TYPES IN JAVA **** //
public class java1 {
    public static void main(String[] args) {
        // integral numbers
        //  byte
        //   short
        //    int
        //    long
        // decimal numbers
        // float
        //  double
        // characters
        // char
        // booleans
        // boolean
//        byte byteValue = 10; // 1 byte
//        short shortValue = byteValue; // 2 byte
//        int intValue = shortValue; // 4 byte
//        long longValue = intValue; // 8 byte
//        float floatValue = longValue; // 4 byte
//        double doubleValue = floatValue; // 8 byte
//
//        System.out.println("int: " + intValue);
//        System.out.println("long: " + longValue);
//        System.out.println("float: " + floatValue);
//        System.out.println("double: " + doubleValue);

        int a = 10;  // 4 byte
        long b = a;  // 8  byte
        float c = a;  // 4 byte
        double d = c; // 8 byte
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        float f = 1.7f;
        int g = (int) f;
        System.out.println(g);

    }
}
