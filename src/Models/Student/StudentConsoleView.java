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
            System.out.println("2. Обновить данные ученика");
            System.out.println("3. Удалить ученика");
            System.out.println("4. Показать всех учеников");
            System.out.println("5. Выход");
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        updateStudent();
                        break;
                    case 3:
                        removeStudent();
                        break;
                    case 4:
                        studentManager.display();
                        break;
                    case 5:
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
        studentManager.create(student);
        studentManager.display(); // Выводим всех студентов
    }

    private void updateStudent(){
        System.out.println("Введите ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите фамилию ученика: ");
        String firstName = scanner.nextLine();
        System.out.println("Введите имя ученика: ");
        String lastName = scanner.nextLine();
        System.out.println("Введите отчество ученика: ");
        String patronymic = scanner.nextLine();
        System.out.println("Введите дату рождения (dd.MM.yyyy): ");
        String dateInput = scanner.nextLine();


        LocalDate dateOfBirth = null;
        if (!dateInput.isEmpty()) {
            dateOfBirth = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }
        studentManager.update(id,
                firstName.isEmpty() ? null : firstName,
                lastName.isEmpty() ? null : lastName,
                patronymic.isEmpty() ? null : patronymic,
                dateOfBirth);
        studentManager.display();
    }

    private void removeStudent() {
        System.out.println("Введите ID: ");
        int id = scanner.nextInt();
        studentManager.delete(id);
        studentManager.display();
    }
}