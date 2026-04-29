
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskSubmissionSystem {
    private static BlockingQueue<String> taskQueue = new LinkedBlockingQueue<>();
    private static ConcurrentLinkedQueue<String> taskQueue1 = new ConcurrentLinkedQueue<>();
    static void main(String[] args) {

        Thread producer = new Thread(() -> {
           while (true) {
               try{
                   taskQueue.put("task" + System.currentTimeMillis()); // adds task (will use locks internally)
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                try{
                    String task = taskQueue.take(); // takes task (will use locks internally)
                    System.out.println("processing: " + task);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();

    }
}
