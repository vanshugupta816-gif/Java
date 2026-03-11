public class testpolymorphism {
    static void main() {
        Animal myAnimal = new Animal();
        myAnimal.sayHello();

        Animal dog = new Dog(); // upcasting
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();

        Dog myDog = (Dog) dog; // downcasting

//            double d = 2.32322;
//             int e = (int)d;
//        System.out.println(e);
    }
}
// polymorphism :-  is a core concept in oops that allow methods to do different things based on the object it is acting upon , even though the method name and its signature might be the same
// contain two types runtime :- overriding ( dynamic method dispatch) , compile time:- overloading
