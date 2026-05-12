
class SharedObj{
    private volatile boolean flag = false;

    public void setflagTrue() {
        System.out.println("writer thread made the flag true !");
        flag = true;
    }

    public void printIfFlagTrue(){
        while (!flag){
            // dp nothing
        }
        System.out.println("flag is true !");
    }
}
public class VolatileExample {
    static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
            sharedObj.setflagTrue();
        });

        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());

        writerThread.start();
        readerThread.start();
    }
}
//  more complex thing cannot do by the volatile
