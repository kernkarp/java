public abstract class Machine implements Run {
    private boolean isMove;
    private String name;
    private int mass;
    private int maxSpeed;

    public Machine(String name, int mass, int maxSpeed) {
        if (name == null)
            throw new NullPointerException("Error: Machine name is null");
        if (name.isBlank())
            throw new IllegalArgumentException("Error: Machine name is empty");
        if (mass <= 0)
            throw new IllegalArgumentException("Error: Machine mass incorrect value");
        if (maxSpeed <= 0)
            throw new IllegalArgumentException("Error: Machine maxSpeed incorrect value");

        this.name = name;
        this.mass = mass;
        this.maxSpeed = maxSpeed;
        isMove = false;
    }

    @Override
    public void setName(String name) {
        if (name == null)
            throw new NullPointerException("Error: Machine name is null");
        if (name.isBlank())
            throw new IllegalArgumentException("Error: Machine name is empty");

        this.name = name;
    }

    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void move() {
        isMove = true;
    }
}
