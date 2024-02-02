import java.util.ArrayList;
import java.util.List;

public class Module {
    private String name;
    private int durationInHours;
    private List<Course> courses;

//    @Override
//    public String toString() {
//        return name+": "+durationInHours;
//    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", durationInHours=" + durationInHours +
                '}';
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public Module(String name, int durationInHours) {
        this.name = name;
        this.durationInHours = durationInHours;
        courses = new ArrayList<>(10);
    }
    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
