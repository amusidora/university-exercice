import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static List<String> readStudentList() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray arr = (JSONArray) parser.parse((new FileReader("/Users/claire.s/PhpstormProjects/university/src/main/resources/students.json")));
        List<String> studentNames = new ArrayList<>(arr.size());
        for(Object obj : arr) {
            JSONObject json = (JSONObject) obj;
            studentNames.add(json.get("name").toString());
        }
        return studentNames;
    }

    public static void main(String[] args) {
        University university = new University();
        Diploma diploma = university.getDiploma();
        System.out.println(diploma.getDuration());
        System.out.println(university.getProfessorsForDiploma(diploma));
        try {
            List<String> allStudents = Main.readStudentList();
            for(String student : allStudents) {
                diploma.addStudent(new Student(student));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
