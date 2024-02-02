import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Diploma diploma = university.getDiploma();
        diploma.addStudent(new Student("Mike"));
        diploma.addStudent(new Student("Dan"));
        diploma.addStudent(new Student("Bob"));
        diploma.addStudent(new Student("Alice"));
        System.out.println(diploma.getDuration());
        System.out.println(university.getProfessorsForDiploma(diploma));
    }
}
