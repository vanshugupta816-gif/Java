
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8Demo {
    static void main(String[] args) {
        // streams
        // java 8 --> minimal code, functional programing
        // java 8 --> lambda expression , streams , date & time API

        // lambda expression --> is an anonymous function ( no name , no return type , no access modifier)

        Thread t1 = new Thread(() -> {
        System.out.println("hello");
        });

        MathOperation sumOperation = (a,b) -> a + b;
        MathOperation subtractOperation = (a,b) -> a - b;
        int res = sumOperation.operate(1,2);
        System.out.println(res);

        // PREDICATED

        // predicates --> Functional interface (boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 ==0;
        System.out.println(isEven.test(4));

        //FUNCTIONS
        // function -> work for you
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));
        System.out.println(doubleIt.apply(100));
        Function<Integer, Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);

        //CONSUMER
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(51);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        // SUPPLIER
        Supplier<String> giveHelloWorld = () -> "HelloWorld";
        System.out.println(giveHelloWorld.get());
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}


//class Task implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("hello");
//    }
//}
