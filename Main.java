public class Main {
    public static void myNumbersProcessing(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
    }

    public static double calcAverageMark(Subject[] subjects) {
        double sumMark = 0;
        for (Subject subject : subjects)
            sumMark += subject.getMark();

        return sumMark / subjects.length;
    }

    public static String marksToString(Subject[] subjects) {
        StringBuilder marks = new StringBuilder("[ ");
        for (Subject subject : subjects) {
            marks.append(String.format("{%s, %.2f, ", subject.getNameSubject(), subject.getMark()));
            if (subject.isPassed())
                marks.append("passed} ");
            else
                marks.append("not passed} ");
        }
        marks.append("]");

        return marks.toString();
    }

    public static void main(String[] args) {
        String[] names = {"Qwer", "Fadsc", "Vgdbv", "Ngbdnh", "Umesvd"};
        String[] bicycleType = {"Sport", "Usual"};
        final int limitVehicle = 5;
        Server server = new Server(4, limitVehicle);
        for (int i = 0; i < limitVehicle; i++) {
            int vehicleType = (int)(Math.random()*(4));
            switch (vehicleType) {
                case 0 -> {
                    Car car = new Car(false, names[(int) (Math.random() * (5))], (int) (100 + Math.random() * (300 - 100)),
                            (20 + Math.random() * (70 - 20)));
                    server.addTransport(0, car);
                }
                case 1 -> {
                    Bicycle bicycle = new Bicycle(false, names[(int) (Math.random() * (5))],
                            bicycleType[(int) (Math.random() * (2))]);
                    server.addTransport(1, bicycle);
                }
                case 2 -> {
                    RollerSkates rollerSkates = new RollerSkates(false, names[(int) (Math.random() * (5))]);
                    server.addTransport(2, rollerSkates);
                }
                case 3 -> {
                    Jumpers jumpers = new Jumpers(false, names[(int) (Math.random() * (5))]);
                    server.addTransport(3, jumpers);
                }
            }
        }
        int[] countVehicles = server.getCountVehicles();
        System.out.println("Count move vehicles: " + server.getCurrentCountVehicle());
        System.out.println("\tCount move cars: " + countVehicles[0]);
        System.out.println("\tCount move bicycles: " + countVehicles[1]);
        System.out.println("\tCount move rollerSkates: " + countVehicles[2]);
        System.out.println("\tCount move jumpers: " + countVehicles[3]);
    }
}