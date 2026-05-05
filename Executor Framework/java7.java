import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class test2 {
    static void main(String[] args) {

        ScheduledExecutorService schedular = Executors.newScheduledThreadPool(1);
        schedular.schedule(
                () -> System.out.println("task executes after 5 second delay !"),
                        5,
                TimeUnit.SECONDS);
        schedular.shutdown();


    }
}
