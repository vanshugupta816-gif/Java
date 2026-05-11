public class StringBuilderAndBufferDemo {
    static void main(String[] args ) throws InterruptedException {
        StringBuilder sb = new StringBuilder();

        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("final length: " + sb.length());
    }
}
class Task extends Thread {
    private StringBuilder sb;

    public Task(StringBuilder sb) {
        this.sb = sb;
    }
     @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }

//         StringBuffer sb = new StringBuffer();
//
//         Task task1 = new Task(sbu);
//         Task  task2 = new Task(sbu);
//
//         task1.start();
//         task2.start();
//
//         task1.join();
//         task2.join();
//
//         System.out.println("final length: " + sb.length());
//     }
//  }
//  class Task extends Thread {
//    private StringBuffer sbu;
//
//    public Task(StringBuffer sbu) {
//        this.sbu = sbu;
//    }
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            sbu.append("a");
//        }
    }
}
