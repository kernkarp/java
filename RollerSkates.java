public class RollerSkates extends Vehicle {
    public RollerSkates(boolean isMove, String name) {
        super(isMove, name);
    }

    @Override
    public void move(int id) {
        isMove = true;
        Math.abs(id);
    }
}
