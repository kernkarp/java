public class Bicycle extends Vehicle {
    private String typeOfBicycle;

    public Bicycle(boolean isMove, String name, String typeOfBicycle) {
        super(isMove, name);

        if (typeOfBicycle == null)
            throw new NullPointerException("Error: Bicycle typeOfBicycle is null");
        if (typeOfBicycle.isBlank())
            throw new IllegalArgumentException("Error: Bicycle typeOfBicycle is empty");

        this.typeOfBicycle = typeOfBicycle;
    }

    @Override
    public void move(int id) {
        isMove = true;
        Math.exp(id);
    }
}
