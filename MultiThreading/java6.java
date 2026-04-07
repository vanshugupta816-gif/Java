// single abstract method
// lamba expression anonymous function

public class LambaExpression {
    static void main(String[] args) {
//        Thread t1 = new Thread(() -> System.out.println("hello"));
//     Runnable task1 = () -> {
//         System.out.println("hello");
//     };
//        Thread t1 = new Thread(task1);
//        t1.start();

        Thread t1 = new Thread(() -> {
            for (int i =0; i < 10; i++){
                System.out.println("hello anshii");
            }
        });
//        int a = 1;
//        Runnable task = () -> {
//            for (int i = 0; i < 10; i++){
//                System.out.println("hello anshii");
//            }
//        };
        t1.start();
    }
}
