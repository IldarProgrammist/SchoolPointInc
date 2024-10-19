package Models;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class LearnTestClass {
    public static void main(String[] args) {

        Student2 student1 = new Student2("Иванов", 20);
        Student2 student2 = new Student2("Петрова", 30);
        Student2 student3 = new Student2("Сидоров", 50);
        Student2 student4 = new Student2("Сидоров", 50);


        HashMap<Student2, Integer> student2IntegerHashMap = new HashMap<>();
        student2IntegerHashMap.put(student1, 10);
        student2IntegerHashMap.put(student2, 20);
        student2IntegerHashMap.put(student3, 30);
        student2IntegerHashMap.put(student4, 50);

        System.out.println(student2IntegerHashMap);
        student2IntegerHashMap.put(student4, 50);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println("******************************");
        System.out.println("Работа с датами");
        System.out.println(LocalDate.now());

        LocalDate curentDate = LocalDate.now();
        LocalDate birghd = LocalDate.of(1989,03,02);

        System.out.println(age(birghd, curentDate));

    }
    public static int age(LocalDate b, LocalDate c){
        Period period = Period.between(b,c);

        return period.getYears();
    }
}


class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
