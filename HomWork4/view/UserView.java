package HomWork4.view;

import HomWork4.data.User;

import java.util.List;

// Принцип разделения интерфейсов (Interface Segregation Principle)
public interface UserView<T extends User> {
    void sendOnConsole(List<T> listT);
}