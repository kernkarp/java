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
        final int limitVehicle = 100;
        Server server = new Server(7, limitVehicle);
        for (int i = 0; i < limitVehicle; i++) {
            int vehicleType = (int)(Math.random()*(7));
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
                case 4 -> {
                    Bus bus = new Bus(names[(int) (Math.random() * (5))], (int)(4 + Math.random() * (10 - 4)),
                            (int)(100 + Math.random() * (250 - 100)), (int)(10 + Math.random() * (30 - 10)));
                    server.addTransport(4, bus);
                }
                case 5 -> {
                    TractorWheeled tractorWheeled = new TractorWheeled(names[(int) (Math.random() * (5))],
                            (int)(4 + Math.random() * (10 - 4)),
                            (int)(100 + Math.random() * (250 - 100)));
                    server.addTransport(5, tractorWheeled);
                }
                case 6 -> {
                    TractorCrawler tractorCrawler = new TractorCrawler(names[(int) (Math.random() * (5))],
                            (int)(4 + Math.random() * (10 - 4)),
                            (int)(100 + Math.random() * (250 - 100)));
                    server.addTransport(6, tractorCrawler);
                }
            }
        }
        int[] countVehicles = server.getCountVehicles();
        System.out.println("Count move vehicles: " + server.getCurrentCountVehicle());
        System.out.println("\tCount move cars: " + countVehicles[0]);
        System.out.println("\tCount move bicycles: " + countVehicles[1]);
        System.out.println("\tCount move rollerSkates: " + countVehicles[2]);
        System.out.println("\tCount move jumpers: " + countVehicles[3]);
        System.out.println("\tCount move bus: " + countVehicles[4]);
        System.out.println("\tCount move tractorWheeled: " + countVehicles[5]);
        System.out.println("\tCount move tractorCrawler: " + countVehicles[6]);
    }
}