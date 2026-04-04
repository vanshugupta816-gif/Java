// **** METHODS IN JAVA**** //
public class javatest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "blue";
        car.speed = 40;
        car.brand = "Tata";
        car.year = 2024;
        car.model = "safari";

        car.accelerate(1);
        System.out.println(car.speed);
    }

// we hide data by apply private function to that data

}

