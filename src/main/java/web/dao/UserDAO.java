package web.dao;

import web.model.*;
import java.util.*;

public interface UserDAO {
//    void createUsersTable();

//    void dropUsersTable();

    void saveUser(User user);

    void removeUserById(Long id);

    List<User> getAllUsers();

//    void cleanUsersTable();

    void updateUserById(User user);

    User getUser(Long id);
}
