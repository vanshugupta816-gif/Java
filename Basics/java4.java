// **** BITWISE OPERATOR IN JAVA **** //
public class java4 {
    public static void main(String[] args) {
        // computer --> 01
        //int a = 5;
        //System.out.println(Integer.toBinaryString(a));

        // operands --> byte short int long
        // and  &
        // or |
        // xor ^
        // not ~
        // left shift <<
        // right shift >>
        // unsigned right shift >>>

        int c = 5 & 4;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(c);

        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        int d = a << 1;
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));

    }
}
