public class tests {
    static void main() {
//        Child child = new Child();
//        System.out.println(child.hasSuperPowers());
//       child.childMethod();

        Child child = new Child(20, "Ansh");
        System.out.println(child.getAge());
        child.childMethod();


    }
}
