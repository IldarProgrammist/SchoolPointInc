package Models.Student;
import Models.Person;
import java.time.LocalDate;

public class Student extends Person {

    public Student(int studentId, String firstName, String lastName, String patronymic,LocalDate dateOfBirth) {
        super(studentId, firstName, lastName, patronymic, dateOfBirth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(getPersonId()).append(" ");
        sb.append("Фамилия: ").append(getFirstName()).append(" ");
        sb.append("Имя: ").append(getLastName()).append(" ");
        sb.append("Отчество: ").append(getPatronymic()).append(" ");
        sb.append( "Возраст: "+ getAge() + " лет");

        return sb.toString();
    }


    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return (this.getPersonId() == student.getPersonId());
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getPersonId());
    }
}

