package Models.Student;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentConsoleView {
    private StudentManager studentManager = new StudentManager();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice = 0;
        do {
            System.out.println("\n1. Добавить ученика");
            System.out.println("2. Удалить ученика");
            System.out.println("3. Показать всех учеников");
            System.out.println("4. Выход");
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        removeStudent();
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
                scanner.next(); // Очистка некорректного ввода
            } catch (Exception e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
            }
        } while (choice != 4);
        scanner.close();
    }

    private void addStudent() {
        System.out.println("Введите ID: ");
        int id = scanner.nextInt();
        System.out.println("Введите фамилию ученика: ");
        String firstName = scanner.next();
        System.out.println("Введите имя ученика: ");
        String lastName = scanner.next();
        System.out.println("Введите отчество ученика: ");
        String patronymic = scanner.next();
        System.out.println("Введите дату рождения (dd.MM.yyyy): ");
        String dateInput = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateOfBirth = LocalDate.parse(dateInput, formatter);
        Student student = new Student(id, firstName, lastName, patronymic, dateOfBirth);

        // Добавляем student в список
        studentManager.add(student);
        studentManager.display(); // Выводим всех студентов
    }

    private void removeStudent() {
        System.out.println("Введите ID: ");
        int id = scanner.nextInt();
        studentManager.remove(id);
        studentManager.display();
    }
}