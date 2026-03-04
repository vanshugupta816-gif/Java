// **** CONDITIONAL STATEMNET **** //
public class java8 {
    static void main(String[] args) {
        // relational operator :- compare two values and return a boolean result
        int a = 1;
        int b = 2;
        boolean c = a < b;
        System.out.println(c);
        // logical operator :- && and , || or , ! not
        int ramMarks = 35;
        int ramAge = 50;
        System.out.println(ramMarks >= 33 && ramAge <= 18);
        // conditional operator
        int age = 2;
        if (age >= 18) {
            System.out.println("you are an adult !");
        } else {
            System.out.println("you are a child !");
        }

        int day = 3;
        switch (day) {
            case 1: {
                System.out.println("monday");
            }
            case 2: {
                System.out.println("tuesday");
            }
            case 3: {
                System.out.println("wednesday");
                break;
            }
            case 4: {
                System.out.println("thursday");
            }
            case 5: {
                System.out.println("friday");
            }
            case 6: {
                System.out.println("saturday");
            }
            case 7: {
                System.out.println("sunday");
            }
            default: {
                System.out.println("invalid day");
            }

        }
    }
}
