public class Main {
    static void main(String[] args) {
//        System.out.println(Day.TUESDAY);
//        System.out.println(Day.MONDAY);

//        Day monday = MONDAY;
//        int ordinal = monday.ordinal();
//        System.out.println(ordinal);
//        System.out.println(monday.name());
//        Day enumDay = Day.valueOf("MONDAY");
//        System.out.println(enumDay);
//        Day[] values = Day.values();
//        for (Day i: values ) {
//            System.out.println(i);
//        }
//        monday.display();
//        System.out.println(monday.getLower());

        Day day = Day.TUESDAY;
        // switch case

        switch (day) {
            case MONDAY -> {
                System.out.println("h");
                break;
            }
            case TUESDAY -> {
                System.out.println("T");
                break;
            }
            default -> {
                System.out.println("anshiii");
            }
        }
    }
}
