// **** METHODS OF JAVA**** //
public class java14 {
    public static void main(String[] args) {
//        System.out.println(sum(1, 2, 3));
//        System.out.println(sum(new int[]{1, 2, 3));
        System.out.println(isPrime(13));
        System.out.println(isPrime(91));
        System.out.println(isPrime(7));
        System.out.println(isPrime(74734));
    }

    //public static int sum(int...a) { // variable no. of arguments
//        int sum = 0;
//        for (int i : a){
//            sum += i;
//        }
//        return sum;

    //}

    public static boolean isPrime(int x) {
        // 13 --> 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        int res = 0;

        for (int i = 1; i < x / 2; i++) {
            if (x % i == 0) {
                res++;
            }
        }

        return res == 1;
    }
}
