package Models;

public interface IUserManager<T> {
    void add(T user);
    void remove(int id);
    void display();
}
