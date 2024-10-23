import Models.Student.Student;
import Models.Student.StudentConsoleView;
import Models.Student.StudentManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        StudentConsoleView studentView = new StudentConsoleView();
       // studentView.run();

        StudentManager studentManager = new StudentManager();
        Student student = new Student(1, "Иванов", "Иван", "Иванович", LocalDate.of(2018,03,02));
        studentManager.create(student);
        System.out.println(student);
        studentManager.update(1, "Петров", null, null, LocalDate.of(2010,03,23));
        System.out.println(student);
    }
}