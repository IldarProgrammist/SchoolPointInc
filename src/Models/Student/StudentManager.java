package Models.Student;
import Models.IUserManager;

import java.time.LocalDate;
import java.util.HashSet;

public class StudentManager implements IUserManager<Student> {
    private HashSet<Student> students;

    public StudentManager() {
        students = new HashSet<>();
    }

    @Override
    public void create(Student student) {
        students.add(student);
    }

    @Override
    public void delete(int id) {
        boolean removed = students.removeIf(student -> student.getPersonId() == id);
        if (removed) {
            System.out.println("Ученик с ID: " + id +" был удален из базы данных");
        } else {
            System.out.printf("Студент с ID:" +  id + " не найден");
        }
    }

    @Override
    public void update(int id, String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        for (Student student : students) {
            if (student.getPersonId() == id) {
                if (lastName != null) {
                    student.setLastName(lastName); // Обновляем фамилию, если передано значение
                }
                if (firstName != null) {
                    student.setFirstName(firstName); // Обновляем имя, если передано значение
                }
                if (patronymic != null) {
                    student.setPatronymic(patronymic); // Обновляем отчество, если передано значение
                }
                if (dateOfBirth != null) {
                    student.setDateOfBirth(dateOfBirth); // Обновляем дату рождения, если передано значение
                }
                System.out.println("Данные обновлены для ученика с ID: " + id);
                return;
            }
        }
        System.out.println("Ученик с таким ID не найден.");
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