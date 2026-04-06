
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

    private final Lock Lock = new ReentrantLock(true);

    public void accessResource() {
        Lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
           Lock.unlock();
        }
    }

    static void main(String[] args) throws InterruptedException {
        FairnessLockExample example = new FairnessLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread1");
        Thread thread2 = new Thread(task, "Thread2");
        Thread thread3 = new Thread(task, "Thread3");

        thread1.start();
        Thread.sleep(500);
        thread2.start();
        Thread.sleep(500);
        thread3.start();
    }
    // disadvantages of synchronised
    // 1. fairness
    // 2. blocking
    // 3. interruptibility
    // 4. read/write locking
}
