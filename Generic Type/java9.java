
//enum Day{
//  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//}

public class Test1 {
    static void main(String[] args) {
//     Day day = Day.MONDAY;
//     //Day dayy = "MONDAY";

        Test1 test1 = new Test1();
        Integer[] intArray = {1, 2, 3, 4};
        String[] StringArray = {"hello", "world"};
        printArray(intArray);
        printArray(StringArray);
        display(12);

    }

    public <T> void display(T element) {
        System.out.println("Generic display: " + element);
    }

    public static void display(Integer element){
        System.out.println("Integer display: " + element);
    }


    public static <T> void printArray(T[] array){
        for (T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

}
