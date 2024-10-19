import Models.Student.Student;
import Models.Student.StudentManager;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;


public static void main(String[] args) {
    StudentManager studentManager = new StudentManager();
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    do {
        System.out.println("\n1. Добавить ученика");
        System.out.println("2. Удалить ученика");
        System.out.println("3. Показать всех учеников");
        try {
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Введите ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Введите фамилию ученика: ");
                    String firstName = scanner.next();
                    System.out.println("Введите имя ученика: ");
                    String lastName = scanner.next();
                    System.out.println("Введите отчество ученика ");
                    String patronymic = scanner.next();
                    System.out.println("Введите дату рождения");
                    String dateInput = scanner.next();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                    LocalDate dateOfBirth = LocalDate.parse(dateInput, formatter);
                    Student student = new Student(id, firstName, lastName, patronymic, dateOfBirth);
                    studentManager.add(student);
                    studentManager.display();
                    break;
                }
                case 2:
                    System.out.println("Введите ID: ");
                    int id = scanner.nextInt();
                    studentManager.remove(id);
                    studentManager.display();
                    break;
                case 3:
                    studentManager.display();
                    break;
                case 4:
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Не верный выбор. Попробуйте снова");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Пожалуйста попробуйте снова");
            scanner.next();
        } catch (Exception e) {
            System.out.println("Произошла ошибка " + e.getMessage());
        }

    } while (choice != 4);
    scanner.close();
}
