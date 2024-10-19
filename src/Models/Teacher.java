package Models;

import java.time.LocalDate;

public class Teacher  extends Person{
    public Teacher(int teacherId, String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        super(teacherId, firstName, lastName, patronymic, dateOfBirth);
    }
}