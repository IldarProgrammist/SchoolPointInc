package Models;

import java.time.LocalDate;

public interface IUserManager<T> {
    void create(T user);
    void delete(int id);
    void update(int id, String firstName, String lastName, String patronymic, LocalDate dateOfBirth);
    void display();
}
