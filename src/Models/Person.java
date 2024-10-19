package Models;

import java.util.Date;

public abstract class Person {
    private int StudentId;
    private String firstName;
    private String lastName;
    private String  patronymic;
    private Date birthDate;

    public Person(){
    }

    public Person(int studentId, String firstName, String lastName, String patronymic) {
        this.StudentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public int getStudentId() {
        return StudentId;
    }
    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private Date dateOfBirth;
}
