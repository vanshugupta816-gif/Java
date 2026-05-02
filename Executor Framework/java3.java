
import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mainlyy {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
         //Future<Integer> future = executorService.submit(() -> 42);
         Future<?> future = executorService.submit(() -> System.out.println("hello"));
//         if(future.isDone()){
//             System.out.println("task is done");
//         }
        System.out.println(future.get());
        if(future.isDone()){
            System.out.println("task is done");
        }
        executorService.shutdown();
    }
}
// agar kuch return krvana h toh callable ayega
// otherwise runnable ayega


