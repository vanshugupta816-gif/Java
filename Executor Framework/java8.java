
import java.util.concurrent.*;

public class test3 {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future1 = executorService.submit(new DependentService());
        Future<String> future2 = executorService.submit(new DependentService());
        Future<String> future3 = executorService.submit(new DependentService());

        future1.get();
        future2.get();
        future3.get();

        System.out.println("all dependent services started. starting generictype.main service...");

    }
}

class DependentService implements Callable{


    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(2000);
        return "ok";
    }
}
// barrier.wait pe hr thread wait krta h
