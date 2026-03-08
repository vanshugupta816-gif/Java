;// **** RECURSION  **** //

public class java16 {
    static void main(String[] args) {
        //  5 + 4 + 3 + 2 + 1
        // 5! = 5.4!
        System.out.println(sumofNNaturalNumbers(5));
    }

    public static int sumofNNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumofNNaturalNumbers(n - 1);
    }
}
