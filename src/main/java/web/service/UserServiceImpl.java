package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
//    @PersistenceContext
//    private EntityManager entityManager;
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void removeUserById(Long id) {
        userDAO.removeUserById(id);
    }

    @Override
//    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void updateUserById(User user) {
//        User userToBeUpdated = entityManager.find(User.class, id);
//        userToBeUpdated.setName(user.getName());
//        userToBeUpdated.setLastName(user.getLastName());
//        userToBeUpdated.setAge(user.getAge());
        userDAO.updateUserById(user);
    }

    @Override
//    @Transactional
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }
}
