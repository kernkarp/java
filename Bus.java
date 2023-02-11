public class Bus extends Machine {
    private int numberOfPassenger;

    public Bus(String name, int mass, int maxSpeed, int numberOfPassenger) {
        super(name, mass, maxSpeed);

        if (numberOfPassenger <= 0)
            throw new IllegalArgumentException("Error: Bus numberOfPassenger incorrect value");

        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }
}
