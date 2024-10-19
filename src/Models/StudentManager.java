package Models;
import java.util.HashSet;

public class StudentManager {
    private HashSet<Student> students;

   public StudentManager(){
        students = new HashSet<>();
    }


    public void addStudent(int id, String firstName, String lastName, String patronymic){
       Student student = new Student(id, firstName, lastName, patronymic);

       if(students.add(student)){
           System.out.println("Ученик добавлен" + " c ID "+id);
       }
       else {
           System.out.println("Ученика с " +  id + " существует в базе данных");
       }
    }


    public void removeStudent(int id){
       Student student = new Student(id, null, null, null);
         if(students.remove(student)){
             System.out.println("Ученик с ID: " + id + " был удален из базы данных");
         }
         else {
             System.out.println("Студент не был удален");
         }
   }

   public  void printStudents(){
       if(students.isEmpty()){
           System.out.println("В базе данных нет учеников");
       }
       else {
           for(Student student : students){
               System.out.println(student);
           }
       }
   }
}

