// single inheritance

public class Animal {
//    public void makeSound(){
//        System.out.println("Some Sound");
//    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("This animal eats food");
    }

    public void sayHello() {

        System.out.println("...");
    }
}
