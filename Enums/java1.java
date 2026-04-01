public enum Day {

    SUNDAY("Sunday"),

    MONDAY("Monday"),

    TUESDAY("Tuesday"),

    WEDNESDAY("Wednesday"),

    THURSDAY("Thursday"),

    FRIDAY("Friday"),

    SATURDAY("Saturday");

    private Day(String lower) {
        System.out.println("our constructor called");
        this.lower = lower;
    }
    private String lower;

    public String getLower() {
        return lower;
    }

    public void display(){
        System.out.println("today is " + this.name());
    }
}
// when we have to list thing we can use enum
