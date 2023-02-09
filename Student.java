public class Student {
    private static int nextId = 0;
    private int id;
    private String name;
    private String surname;
    private String group;
    private Subject[] subjects;

    public Student() {
        subjects = null;
        name = null;
        surname = null;
        group = null;
        id = -1;
    }

    public Student(String name, String surname, String group, Subject[] subjects) {
        if (name == null)
            throw new NullPointerException("Error: Student name is null");
        if (name.isBlank())
            throw new IllegalArgumentException("Error: Student name is empty");
        if (surname == null)
            throw new NullPointerException("Error: Student surname is null");
        if (surname.isBlank())
            throw new IllegalArgumentException("Error: Student surname is empty");
        if (group == null)
            throw new NullPointerException("Error: Student group is null");
        if (group.isBlank())
            throw new IllegalArgumentException("Error: Student group is empty");
        if (subjects == null)
            throw new NullPointerException("Error: Student subjects is null");

        this.id = nextId;
        nextId += 1;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.subjects = subjects.clone();
    }

    public void setId() {
        this.id = nextId;
        nextId += 1;
    }

    public void setName(String name) {
        if (name == null)
            throw new NullPointerException("Error: Student name is null");
        if (name.isBlank())
            throw new IllegalArgumentException("Error: Student name is empty");

        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null)
            throw new NullPointerException("Error: Student surname is null");
        if (surname.isBlank())
            throw new IllegalArgumentException("Error: Student surname is empty");

        this.surname = surname;
    }

    public void setGroup(String group) {
        if (group == null)
            throw new NullPointerException("Error: Student group is null");
        if (group.isBlank())
            throw new IllegalArgumentException("Error: Student group is empty");

        this.group = group;
    }

    public void setSubjects(Subject[] subjects) {
        if (subjects == null)
            throw new NullPointerException("Error: Student subjects is null");

        this.subjects = subjects.clone();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public int getId() {
        return id;
    }

    public Subject[] getSubjects() {
        return subjects.clone();
    }
}
