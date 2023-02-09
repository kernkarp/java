public class Main {
    public static void myNumbersProcessing(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
    }

    public static void main(String[] args) {
        float x = -4.5f;
        float y = 0.75E-4f;
        float z = 84.5f;
        float xstep = 0.2f;
        float ystep = 0.0002f;
        float zstep = 2f;
        int size = 5;
        x -= xstep;
        y -= ystep;
        z -= zstep;

        Calculator calculator = new Calculator(size, xstep, ystep, zstep);
        calculator.set(x, y, z);
        calculator.calculate();
        calculator.print();
    }
}