public class Main {
    public static void myNumbersProcessing(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
    }

    public static void main(String[] args) {
        float x = -4.5f;
        float y = 0.75E-4f;
        float z = 84.5f;

        Formula formula = new Formula();

        formula.set(x, y, z);
        formula.run();
        formula.print();
    }
}