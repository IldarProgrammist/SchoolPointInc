package Models.Student;
import Models.IUserManager;
import java.util.HashSet;

public class StudentManager implements IUserManager<Student> {
    private HashSet<Student> students;

    public StudentManager() {
        students = new HashSet<>();
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void remove(int id) {
        boolean removed = students.removeIf(student -> student.getPersonId() == id);
        if (removed) {
            System.out.println("Ученик с ID: " + id +" был удален из базы данных");
        } else {
            System.out.printf("Студент с ID:" +  id + " не найден");
        }
    }

    @Override
    public void display() {
        if (students.isEmpty()) {
            System.out.println("В базе данных нет учеников");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}