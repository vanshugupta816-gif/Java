
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Java8DemoTask2 {
    static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

        // biPredicate , biconsumer , bifunction

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));
        BiConsumer<Integer, String > biconsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bc"));

        // UNARY AND BINARY OPERATOR
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;

        // METHOD REFERENCE --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("ansh", "vanshu", "anaya");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);

        // CONSTRUCTOR REFERENCE
        List<String> names = Arrays.asList("a", "b", "c");
        List<phone> phoneList = names.stream().map(phone::new).collect(Collectors.toList());
        System.out.println(phoneList);

    }

    static class phone{
        private String name;

        public phone(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "phone{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
