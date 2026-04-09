public class MyThread4 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("hello monkey");
        }
    }

    static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4(); // user thread means useful work krvate h
        myThread4.setDaemon(true);
        MyThread4 t1 = new MyThread4();
        t1.start();
        myThread4.start();
        System.out.println("generictype.main done");
    }
}
 // daemon threads are the background thread for which jvm do not wait
