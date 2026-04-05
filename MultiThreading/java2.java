public class Counter {

    private static int count = 0;

    public synchronized void increment(){
        synchronized (this){  // synchronized block
            count++;
        } // we can use only one method between both

    }

    public static int getCount(){
        return count;
    }
}
// when we apply synchronized method it means that one time one loop run and then further
// when we do not use synchronized keyword that situation called raised condition
