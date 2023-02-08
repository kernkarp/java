public class Main {
    public static void myNumbersProcessing(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
    }

    public static void main(String[] args) {
        int a = (int) (20+Math.random()*(30-20));
        int b = (int) (40+Math.random()*(50-40));

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        myNumbersProcessing(a, b);
    }
}
