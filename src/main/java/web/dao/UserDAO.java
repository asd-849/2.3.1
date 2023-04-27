package web.dao;

import web.model.*;
import java.util.*;

public interface UserDAO {
    void saveUser(User user);

    void removeUserById(Long id);

    List<User> getAllUsers();

    void updateUserById(User user);

    User getUser(Long id);
}
