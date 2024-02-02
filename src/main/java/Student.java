public class Student {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }
}
