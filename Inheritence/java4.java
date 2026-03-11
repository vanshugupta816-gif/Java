public class javatest {
    public static void main(String[] args) {
//       Animal dog = new Dog();
//         dog.makeSound();
// this above step is polymorphism
// Abstraction :-
// hiding implementing details

        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("sufi");
        dog.eat();
        dog.sayHello();
    }
}

// java does not support multiple inheritance because when we do this inheritance its creates ambiguity and java does not support ambiguity
