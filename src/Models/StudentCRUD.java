package Models;
import java.util.ArrayList;
import java.util.List;

public class StudentCRUD {
    private  List<Student> students;

    public void createStudent(Student student){
        students = new ArrayList<>();
        students.add(student);
    }
    public void deleteStudent(Student student){
        students = new ArrayList<>();
        students.remove(student);
    }
}