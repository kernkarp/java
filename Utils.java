public class Utils {
    public static Student getTheBestStudent(Student[] students) {
        Student bestStudent = new Student();
        double bestAverageMark = -1;
        for (Student student : students) {
            double sumMark = 0;
            for (Subject subject : student.getSubjects())
                sumMark += subject.getMark();

            double averageMark = sumMark / student.getSubjects().length;
            if(bestAverageMark < averageMark)
                bestStudent = student;
        }

        return bestStudent;
    }

    public static String getTheBestSubject(Student[] students) {
        Student bestStudent = getTheBestStudent(students);

        Subject[] subjects = bestStudent.getSubjects();
        Subject bestSubject = subjects[0];
        for (Subject subject : subjects)
            if (bestSubject.getMark() < subject.getMark())
                bestSubject = subject;

        return bestSubject.getNameSubject();
    }
}
