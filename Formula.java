public class Formula {
    private float x;
    private float y;
    private float z;

    private double result;

    public void set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void run() {
        result = Math.pow(8 + Math.pow(Math.abs(x - y), 2) + 1, 1/3.0) / (x*x + y*y + 2) -
                Math.exp(Math.abs(x-y)) * Math.pow(Math.pow(Math.tan(z), 2) + 1, x);
    }

    public void print() {
        System.out.println("Formula result = " + result);
    }

    public double getResult() {
        return result;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
}
