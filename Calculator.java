import java.util.ArrayList;

public class Calculator {
    private int size;
    private Formula[] results;
    private float xstep;
    private float ystep;
    private float zstep;

    public Calculator(int size, float xstep, float ystep, float zstep) {
        this.size = size;
        this.results = new Formula[size];
        this.xstep = xstep;
        this.ystep = ystep;
        this.zstep = zstep;
    }

    void set (float x, float y, float z) {
        results[0] = new Formula();
        results[0].set(x, y, z);
        results[0].run();
    }

    void calculate() {
        float startx = results[0].getX();
        float starty = results[0].getY();
        float startz = results[0].getZ();

        for (int index = 1; index < size; index++) {
            results[index] = new Formula();
            results[index].set(startx + xstep*index, starty + ystep*index, startz + zstep*index);
            results[index].run();
        }
    }

    void print() {
        for (Formula formula : results)
            System.out.printf("For values x=%f, y=%f, z=%f the result is %f\n",
                    formula.getX(), formula.getY(), formula.getZ(), formula.getResult());
    }
}
