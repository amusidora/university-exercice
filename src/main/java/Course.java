public class Course {
    private String name;
    private String minimumGrade;
    private int credits;
    private Professor professor;

    public Course(String name, String minimumGrade, int credits) {
        this.name = name;
        this.minimumGrade = minimumGrade;
        this.credits = credits;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }
}
