public interface Animal {

    int MAX_AGE = 150;

    public abstract void eat();
    void sleep();

    public static void info(){
        System.out.println("this is an Animal interface");
    }

    default void run(){
        this.eat();
        System.out.println("Animal is running");
    }

}
