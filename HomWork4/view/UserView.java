package HomWork4.view;

import HomWork4.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> listT);
}