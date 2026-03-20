public class test {
    static void main(String[] args) {
        Dog dog = new Dog("tffi");
        dog.makeSound();
//        dog.setDogSound("woof");
//        dog.makeSound();
        dog.wagTail();
        dog.changeSound("woof");
    }
}
