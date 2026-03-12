public class Child extends Parent {
    public Child(int age, String name) {
        super(age, name); // no argument constructor
        System.out.println("Child constructor called");
    }
    // by the help of super we called the parametrized constructor

    public void childMethod() {
        super.parentMethod(); // isko hum kahin bhi put kr skte h upper or niche both
        System.out.println("Child method called");
    }
}
