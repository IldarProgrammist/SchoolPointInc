import Models.Student;
import Models.StudentCRUD;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("1","Петров", "Петр", "Петрович");
        Student student2 = new Student("2","Иванов", "Петр", "Иванович");
        Student student3 = new Student("3","Сидоров", "Иван", "Александрович");

        StudentCRUD studentCRUD = new StudentCRUD();
        studentCRUD.createStudent(student);
        studentCRUD.createStudent(student2);
        studentCRUD.createStudent(student3);

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

        studentCRUD.deleteStudent(student2);

        System.out.println("**************************************");
        System.out.println("Удален ученик " + student2.getFirstName()+" " + student2.getLastName());
    }
}
