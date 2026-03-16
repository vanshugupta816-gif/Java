public class test {
    static void main() {
        // we cannot create animal class object because this class is abstract
        Animal dog = new Dog();
        dog.sayHello();
    }
}
