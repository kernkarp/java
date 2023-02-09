public class Subject {
    private String nameSubject;
    private float mark;
    private boolean passed;

    public Subject() {
        nameSubject = null;
        mark = -1f;
        passed = false;
    }

    public Subject(String nameSubject, float mark) {
        if (nameSubject == null)
            throw new NullPointerException("Error: nameSubject is null");
        if (nameSubject.isBlank())
            throw new IllegalArgumentException("Error: nameSubject is empty");
        if (mark < 1 || mark > 5)
            throw new IllegalArgumentException("Error: mark incorrect value");

        this.nameSubject = nameSubject;
        this.mark = mark;
        passed = !(mark <= 2);
    }

    public void setMark(float mark) {
        if (mark < 1 || mark > 5)
            throw new IllegalArgumentException("Error: mark incorrect value");

        this.mark = mark;
    }

    public void setNameSubject(String nameSubject) {
        if (nameSubject == null)
            throw new NullPointerException("Error: nameSubject is null");
        if (nameSubject.isBlank())
            throw new IllegalArgumentException("Error: nameSubject is empty");

        this.nameSubject = nameSubject;
    }

    public void setPassed() {
        if (mark < 1 || mark > 5)
            throw new IllegalArgumentException("Error: mark incorrect value");

        passed = !(mark <= 2);
    }

    public float getMark() {
        return mark;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public boolean isPassed() {
        return passed;
    }
}
