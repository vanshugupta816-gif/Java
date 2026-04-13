
public class testC {
    static void main(String[] args) {
        Counter counter = new Counter();
        MythreadC t1 =new MythreadC(counter);
        MythreadC t2 =new MythreadC(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
