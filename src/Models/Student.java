package Models;
public class Student extends Person {

    public Student(String studentId, String firstName, String lastName, String patronymic) {
        super(studentId, firstName, lastName, patronymic);
    }

    @Override
    public String toString(){
        return "Id: " + " "+ getStudentId()+ " "+"Имя: "+ getLastName() + " " + "Фамилия:  " + getFirstName();
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return (this.getStudentId() == student.getStudentId());
    }
}

