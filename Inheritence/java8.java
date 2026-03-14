public class Parent extends Grandparent {

    public Parent(int age, String name) {
        super(age, name); // first statement hi hona chahiye
        System.out.println("Parent constructor called");
    }

    public void parentMethod() {
        System.out.println("Parent method called");
    }
}
