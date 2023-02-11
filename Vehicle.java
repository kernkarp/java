public abstract class Vehicle {
    protected boolean isMove;
    protected String name;

    public Vehicle(boolean isMove, String name) {
        if (name == null)
            throw new NullPointerException("Error: Vehicle name is null");
        if (name.isBlank())
            throw new IllegalArgumentException("Error: Vehicle name is empty");

        this.isMove = isMove;
        this.name = name;
    }

    public abstract void move(int id);
}
