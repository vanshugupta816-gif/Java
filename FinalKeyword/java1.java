// we use final when we have to do value constant
// final does not allow on constructor

public final class Car extends vehicle {

    private final int speedLimit;

    public Car() {
        speedLimit = 200;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }


    public void accelerate() {

    }


    public void decelerate() {

    }

    public final void airBags() {
        System.out.println("4 Air bags");
    }


}
