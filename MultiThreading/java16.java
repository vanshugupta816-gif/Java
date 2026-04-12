
public class test {
    static void main(String[] args) {

        World world = new World() ; //new state thread
//        world.start();
        Thread t1 = new Thread(world);
        t1.start(); // runnable

        for (; ; ){
//            System.out.println(Thread.currentThread().getName());
            System.out.println("hello");
        }

    }
}
