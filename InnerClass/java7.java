public class test {
    static void main(String[] args) {
        Car car = new Car("tata safari");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

        Computer computer = new Computer("HP", "ABC", "XYZ");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("type-c");
        Computer.USB usb2 = new Computer.USB("type-c");

        ShoppingCart shoppingCart = new ShoppingCart(150);
//        CreditCardV0 creditCard = new CreditCardV0("3232");
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("paid " + amount + " using credit card.");
            }
        });


        Hotel hotel = new Hotel("sunshine", 10, 5);
        hotel.ReservedRooms("vanshu", 1);
    }
}
