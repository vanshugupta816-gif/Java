// **** LOOPS  **** //
public class java9 {
    static void main(String[] args) {
        // while loop
        int i = 1;
        while (i <= 50) {
            System.out.println(i);
            i++;
        }
        // do-while loop
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (i <= 50);
        // for loop
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }

          /*
          1
          10
          100
          1000
          10000
          100000
          */

        for (int h = 1, f = 1; f <= 6; h = h * 10, f++) {
            System.out.println(h);
        }

        // print table of 7
        for (int e = 1; e <= 10; e++) {
//            System.out.println(e * 7);
            System.out.println(e + " x 7 = " + e * 7);
        }
        // sum of first 10 natural numbers
        int sum = 0;
        int s = 1;
        while (s <= 10) {
            sum = sum + s;
            s++;
            System.out.println(sum);
        }
        // count digits of a number
        int n = 46734633;
        int res = 0;
        while (n > 0) {
            n = n / 10;
            res++;
            System.out.println(res);
        }
//        *
//        **
//        ***
//        ****
//        *****
//        ******
        for (int r = 0; r < 6; r++) {
            for (int d = 0; d <= r; d++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
