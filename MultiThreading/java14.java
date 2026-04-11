
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    
    private final Lock lock = new ReentrantLock();
    
    public void outerMethod() {
        lock.lock();
        try{
            System.out.println("outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        lock.lock();
        try{
            System.out.println("inner method");
        } finally {
            lock.unlock();
        }
    }

    static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();

    }
}
//  this show how deadlock prevent
