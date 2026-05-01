
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    static void main(String[] args) {
//        CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//            }catch (Exception e) {
//
//            }
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (Exception e){

        }
            return "ok";
        });
        String s = null;
        try {
            s = completableFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e){
            throw new RuntimeException(e);
        }
        System.out.println("generictype.main");
    }
}
