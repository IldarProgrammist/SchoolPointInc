package Models;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
    private int personId;
    private String firstName;
    private String lastName;
    private String  patronymic;
    private LocalDate dateOfBirth;
    

    public Person(int personId, String firstName, String lastName, String patronymic, LocalDate dateOfBirth ) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;

    }

    public int getPersonId() {
        return personId;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        if (dateOfBirth == null) {
            throw new IllegalStateException("Дата рождения не может быть null");
        }
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);

        return period.getYears();
    }
}
