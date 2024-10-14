import Models.Student;
import Models.StudentCRUD;
import Models.Teacher;
import Models.TeacherCRUD;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("1","Петров", "Петр", "Петрович");
        Student student2 = new Student("2","Иванов", "Петр", "Иванович");
        Student student3 = new Student("3","Сидоров", "Иван", "Александрович");

        Teacher teacher = new Teacher("1","Сидоров", "Владимир", "Иванович");
        Teacher teacher2 = new Teacher("1","Петрова", "Анна", "Петровна");


        StudentCRUD studentCRUD = new StudentCRUD();
        studentCRUD.create(student);
        studentCRUD.create(student2);
        studentCRUD.create(student3);

        System.out.println("Ученики");

        System.out.println("Фамилия: "+ student.getFirstName());
        System.out.println("Имя: "+ student.getLastName());
        System.out.println("Отчество: "+ student.getPatronymic());

        System.out.println("**************************************");

        System.out.println("Фамилия: "+ student2.getFirstName());
        System.out.println("Имя: "+ student2.getLastName());
        System.out.println("Отчество: "+ student2.getPatronymic());

        System.out.println("**************************************");

        System.out.println("Фамилия: "+ student3.getFirstName());
        System.out.println("Имя: "+ student3.getLastName());
        System.out.println("Отчество: "+ student3.getPatronymic());

        studentCRUD.delete(student2);

        System.out.println("**************************************");
        System.out.println("Удален ученик " + student2.getFirstName()+" " + student2.getLastName());

        System.out.println("********************************************************************");
        System.out.println("Учителя");

        TeacherCRUD teacherCRUD = new TeacherCRUD();
        teacherCRUD.create(teacher);
        System.out.println("Фамилия: "+ teacher.getFirstName() + " " + teacher.getLastName());
        System.out.println("Фамилия: "+ teacher2.getFirstName() + " " + teacher2.getLastName());
    }
}
