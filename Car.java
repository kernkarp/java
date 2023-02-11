public class Car extends Vehicle {
    private int maxSpeed;
    private double amountFuel;
    private double maxFuel;

    public Car(boolean isMove, String name, int maxSpeed, double maxFuel) {
        super(isMove, name);

        if (maxSpeed <= 0)
            throw new IllegalArgumentException("Error: Car maxSpeed incorrect value");
        if (maxFuel <= 0)
            throw new IllegalArgumentException("Error: Car maxFuel incorrect value");

        this.maxSpeed = maxSpeed;
        this.maxFuel = maxFuel;
        amountFuel = 0+Math.random()*(maxFuel-0);
    }

    @Override
    public void move(int id) {
        isMove = true;
        amountFuel = 0+Math.random()*(maxFuel-0);
    }
}
