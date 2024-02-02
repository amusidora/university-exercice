import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class University {
    private String name;
    private String location;
    private Diploma diploma;
    private List<Professor> professors;

    public University() {
        location = "Los Angeles";
        name = "UCLA";
        Module module1 = new Module("CS Fundamentals", 250);
        module1.addCourse(new Course("Computer Science 101", "C", 500));
        module1.addCourse(new Course("Algorithmic 101", "B", 200));
        module1.addCourse(new Course("Intermediate Math", "B", 300));

        Module module2 = new Module("Hardware Architecture", 10);
        module2.addCourse(new Course("Intro to computer networks", "B", 100));
        module2.addCourse(new Course("Shell programming", "C", 150));

        diploma = new Diploma("CS Degree");
        diploma.addModule(module1);
        diploma.addModule(module2);

        professors = new ArrayList<Professor>();
        Professor professor1 = new Professor("Professor Snape");
        Professor professor2 = new Professor("Professor McGonagall");
        professors.add(professor1);
        professors.add(professor2);
        List<Course> coursesForModule1 = module1.getCourses();
        for(Course i : coursesForModule1) {
            i.setProfessor(professor1);
        }

        List<Course> coursesForModule2 = module2.getCourses();
        for(Course i : coursesForModule2) {
            i.setProfessor(professor2);
        }
    }

    public Diploma getDiploma() {
        return diploma;
    }

    public Set<String> getProfessorsForDiploma(Diploma diploma) {
        List<Module> modulesForDiploma = diploma.getModules();
        Set<String> professorNames = new HashSet<>();

        for(Module i : modulesForDiploma) {
            List<Course> coursesForModule = i.getCourses();
            for(Course j : coursesForModule) {
                String professorForCourse = j.getProfessor().getName();
                professorNames.add(professorForCourse);
            }
        }
        return professorNames;
    }
}
