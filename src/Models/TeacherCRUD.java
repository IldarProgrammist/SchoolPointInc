package Models;
import java.util.HashSet;
import java.util.Set;

public class TeacherCRUD {
    private Set<Teacher> teachers;

    public void create(Teacher teacher){
        teachers = new HashSet<>();
        teachers.add(teacher);
    }
    public void deleteStudent(Teacher teacher){
        teachers = new HashSet<>();
        teachers.remove(teacher);
    }
}
