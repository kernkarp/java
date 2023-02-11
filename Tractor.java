public abstract class Tractor extends Machine {
    private String type;

    public Tractor(String name, int mass, int maxSpeed, String type) {
        super(name, mass, maxSpeed);

        if (type == null)
            throw new NullPointerException("Error: Tractor type is null");
        if (type.isBlank())
            throw new IllegalArgumentException("Error: Tractor type is empty");

        this.type = type;
    }

    public String getType() {
        return type;
    }
}
