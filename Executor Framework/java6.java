
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class test1 {
    static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1 , callable2 , callable3);

//         List<Future<Integer>> futures = executorService.invokeAll(list, 1,TimeUnit.SECONDS);
//         for(Future<Integer> f: futures){
//             System.out.println(f.get());
//         }
        List <Future<Integer>> futures = null;
        try {
            futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
        }catch (InterruptedException e) {

        }
        for (Future<Integer> f: futures){
            try {
                System.out.println(f.get());
            }catch (CancellationException e) {

            }catch (InterruptedException e) {

            } catch (ExecutionException e){

            }
        }
         executorService.shutdown();
        System.out.println("hello anshii");
    }
}
