package Models;

import Models.Student.Student;

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
        Student student = new Student(id, null, null, null, null);
        if (students.remove(student)) {
            System.out.println("Ученик с ID: " + id + " был удален из базы данных");
        } else {
            System.out.println("Студент не был удален");
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

