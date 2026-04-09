
public class MyThread3 extends Thread{

    public MyThread3(String name){
        super(name);
    }

    @Override
    public void run() {
//        try{
//            Thread.sleep(1000);
//            System.out.println("thread is running...");
//        } catch (InterruptedException e){
//            System.out.println("thread interrupted: " + e);
//        }
//    }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield(); // gives output in more proper format when we apply this
        }
    }

        static void main (String[]args) throws InterruptedException {
//        MyThread3 t1 = new MyThread3();
//        t1.start();
//        t1.interrupt();

                MyThread3 t1 = new MyThread3("t1");
                MyThread3 t2 = new MyThread3("t2");
                t1.start();
                t2.start();

            }
        }
