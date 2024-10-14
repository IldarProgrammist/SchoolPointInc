package Models;
import java.util.ArrayList;
import java.util.List;

public class StudentCRUD {
    public void createStudent(Student student){
       List<Student> students = new ArrayList<>();
       students.add(student);
    }

    public void deleteStudent(Student student){
        List<Student> students = new ArrayList<>();
        students.remove(student);
    }
}
