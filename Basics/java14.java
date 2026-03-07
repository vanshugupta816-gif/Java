// **** RECURSION **** //

public class java15 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        // 5.4.3.2.1

        //5! = 5.4!
    }

    public static int factorial(int n) {
//        int res = 1;
//        for(int i = 1; i <= n; i++){
//            res = res * i;
//        }
//        return res;
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
// call stack:- track method call
