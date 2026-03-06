// **** METHODS IN JAVA**** // under oops
public class java13 {

    public static void main(String[] args) {
//            int[] a = {3, 3, 3, 3, 34, 45};
//            SumofArray(a);
//            System.out.println(SumofArray(a););
//            int[] b = {3, 3, 3, 3, 3, 21, 1, 2, 33};
//            SumofArray(b);

        String res = upperFun("Vanshu  ");
        System.out.println(res);
        System.out.println(sum(3, 7));
        System.out.println(sum(1, 2, 3));
        String a = "vanshu";


    }

    //when we have to return something we use int in public static and when we don't have to return something we right void on int place
    public static int SumofArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }

    private static String upperFun(String str) {
        return str.trim().toUpperCase();
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) { // method overloading
        return a + b + c;
    }
}




