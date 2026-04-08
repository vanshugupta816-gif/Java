
public class MyThread2 extends Thread{

    public MyThread2(String name){
      super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            String a = "";
            for(int j = 0; j < 10000000; j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " - Priority:" + Thread.currentThread().getPriority() + " - count:"+ i );
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
    static void main(String[] args) throws InterruptedException {
        MyThread2 l = new MyThread2("low priority thread");
        MyThread2 m = new MyThread2("medium priority thread");
        MyThread2 h = new MyThread2("high priority thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();

    }
}
