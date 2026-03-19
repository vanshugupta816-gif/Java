public class Dog extends Animal {

    public Dog(String name) {
        super(name, "Bark");
    }

    public void wagTail() {
        System.out.println(getName() + " is wagging it tail");
    }

    private String getName() {
        return getClass().getSimpleName();
    }

    public void setDogSound(String newSound) {
        changeSound(newSound);
    }
}
