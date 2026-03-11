public class Dog extends Animal {
    //    public void makeSound(){
//        System.out.println("Woof");
//    }
    @Override // this means we use @ that is called annotation
    public void sayHello() {
        System.out.println("woof"); // override
    }

    public void sayBye() {
        System.out.println("woof Woof");
    }

}
