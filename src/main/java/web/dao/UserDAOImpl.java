package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
//    @Transactional
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
//    @Transactional
    public void removeUserById(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
//    @Transactional
    public void updateUserById(User user) {
//        User userToBeUpdated = entityManager.find(User.class, id);
//        userToBeUpdated.setName(user.getName());
//        userToBeUpdated.setLastName(user.getLastName());
//        userToBeUpdated.setAge(user.getAge());
        entityManager.merge(user);
    }

    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }
}
