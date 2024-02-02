import java.util.ArrayList;
import java.util.List;

public class Diploma {
    private String name;
    private List<Module> modules;
    private List<Student> students;

    public Diploma(String name) {
        this.name = name;
        students = new ArrayList<>(10);
        modules = new ArrayList<>(10);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public List<Module> getModules() {
        return modules;
    }

    public int getDuration() {
        int duration = 0;
        for(Module i: modules) {
            System.out.println("INSTANCE "+i);
            duration+= i.getDurationInHours();
        }
        return duration;
    }

    public List<Student> getStudents() {
        return students;
    }
}
