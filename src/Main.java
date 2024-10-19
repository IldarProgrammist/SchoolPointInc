import Models.Student;
import Models.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(1,"Петров","Петр", "Петрович");
        Student student2 = new Student(2,"Иванов", "Петр", "Иванович");
        Student student3 = new Student(3,"Сидоров", "Иван", "Александрович");

        Teacher teacher = new Teacher(1,"Сидоров", "Владимир", "Иванович");
        Teacher teacher2 = new Teacher(2,"Петрова", "Анна", "Петровна");
        Teacher teacher3 = new Teacher(3,"Петрова", "Анна", "Петровна");

       /* System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        */

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);

        for (Student s : studentList) {
           // System.out.println(s.toString());
        }

        System.out.println("Проверка равенства объектов");
        System.out.println("Проверка при помощи == ");
        student = student2;
        System.out.println(student == student2);
        System.out.println("Проверка при помощи equals ");
        System.out.println(student.equals(student2));


        //        System.out.println("HashCode for student: "+ student.hashCode());
//        System.out.println("HashCode for student2: "+student2.hashCode());
//        System.out.println("HashCode for student3: "+student3.hashCode());


        // String srt = "123";
        //String srt2 = "123";

        // System.out.println( srt.equals(srt2));
        // srt = srt2;

        /*
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student);
        studentMap.put(2, student2);

        System.out.println(studentMap.get(2));
        */
    }
}