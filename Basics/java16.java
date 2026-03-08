// **** EXCEPTIONS **** //

public class java18 {

    static void main(String[] args) {
        try {
            int n = 100000;
            int x = n/0;
        } catch (Exception t) {
            throw new RuntimeException("Error ocurred",t);
        } finally {
            System.out.println(10);
        }

    }
}
