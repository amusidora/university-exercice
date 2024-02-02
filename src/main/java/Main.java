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
        List<Module> modulesForDiploma = diploma.getModules();
        Set<String> professorNames = new HashSet<>();

        for(Module i : modulesForDiploma) {
            List<Course> coursesForModule = i.getCourses();
            for(Course j : coursesForModule) {
                String professorForCourse = j.getProfessor().getName();
                professorNames.add(professorForCourse);
            }
        }

        System.out.println("SET => "+professorNames);
        System.out.println(diploma.getDuration());
    }
}
