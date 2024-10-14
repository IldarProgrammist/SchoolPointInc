package Models;
import java.util.ArrayList;
import java.util.List;

public class StudentCRUD {
    private  List<Student> students;

    public void create(Student student){
        students = new ArrayList<>();
        students.add(student);
    }
    public void delete(Student student){
        students = new ArrayList<>();
        students.remove(student);
    }
}