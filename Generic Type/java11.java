
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test3 {
    static void main(String[] args) {
//        ArrayList<?> list = new ArrayList<String>();
//    }
//
//
//    public <T> T getFirst(ArrayList<T> list){
//        for(Object o: list){
//            System.out.println(o); // question mark ka use tab jab readonly pe kaam krre ho
//        }
//       return list.get(0);
//    }
//
//    public <T> void copy(ArrayList<T> source, ArrayList<T> destination) {
//        for (T item : source) {
//            destination.add(item);
//        }
        System.out.println(sum(Arrays.asList(1,2.2,22)));
    }

    public static double sum(List<? extends Number> numbers){  // upper bound
        double sum = 0;
        for(Number o: numbers) {
            sum += o.doubleValue();
        }
        return sum;
    }
    public static void printNumbers(List<? super Integer> list){  // lower boundk
        for(Object obj: list){
            System.out.println(obj);
        }
    }
}

/* java does not support generic execptions due to type erasure. type erasure means that generic type information
   is removed at runtime . since exception are closely tied to runtime  operation (like catching them in try-catch blocks),
   having generic exception would not work as expected . for example , if you had an exception like mygenericexception<T>,
   you would not be able to catch it with a specific type parameter because that type information would be erased at runtime
 */

