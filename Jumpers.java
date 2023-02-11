public class Jumpers extends Vehicle {
    public Jumpers(boolean isMove, String name) {
        super(isMove, name);
    }

    @Override
    public void move(int id) {
        isMove = true;
        Math.acos(id);
    }
}
