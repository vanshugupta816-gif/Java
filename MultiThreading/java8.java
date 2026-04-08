public class MyThread extends Thread {
    @Override
    public void run(){
       System.out.println("thread is running...");
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
    static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        System.out.println("hello");
    }
//    @Override
//    public void run() { // we can not use this equation(throws InterruptedException) because this equation overrides
//        System.out.println("RUNNING");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    static void generictype.main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());
////        System.out.println(Thread.currentThread().getState());
//        Thread.sleep(100);
//        System.out.println(t1.getState());
//        t1.join();
//        System.out.println(t1.getState());
//    }


}
// we study in this :- start, run, sleep, join, setpriority, interrupt, setDaemon
