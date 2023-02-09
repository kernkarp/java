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
        String[] nameSubjects = {"gbfdv", "trhegedf", "vfdsbhdf", "nytrhgdf", "njnghgf"};
        String[] names = {"Qwer", "Fadsc", "Vgdbv", "Ngbdnh", "Umesvd"};
        String[] surnames = {"Nhgfdv", "Fbsgdsvf", "Bysgfv", "Yyrfsn", "Jsczcz"};
        String group = "FF-22";
        Student[] students = new Student[5];

        for (int index = 0; index < students.length; index++){
            Subject[] subjects = new Subject[5];
            for (int jindex = 0; jindex < subjects.length; jindex++)
                subjects[jindex] = new Subject(nameSubjects[jindex], (float)(2+Math.random()*(5-2)));

            students[index] = new Student(names[index], surnames[index], group, subjects);
        }

        for (Student student : students) {
            double averageMark = calcAverageMark(student.getSubjects());
            System.out.printf("Student %s %s:\n\tMarks and passed = %s\n\tAverage Mark = %f\n"
            , student.getName(), student.getSurname(), marksToString(student.getSubjects()), averageMark);
            if (averageMark >= 4 && averageMark < 5)
                System.out.println("\tRegular Scholarship");
            else if (averageMark == 5)
                System.out.println("\tIncreased Scholarship");
            else
                System.out.println("\tWithout a Scholarship");
        }
    }
}