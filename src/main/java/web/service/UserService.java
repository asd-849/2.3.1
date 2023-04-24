package web.service;

import web.model.User;
import web.model.*;
import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUserById(Long id);

    List<User> getAllUsers();

    void updateUserById(User user, Long id);

    User getUser(Long id);
}
