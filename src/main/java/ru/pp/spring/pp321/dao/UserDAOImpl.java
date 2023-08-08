package ru.pp.spring.pp321.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import ru.pp.spring.pp321.model.User;

import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> allUsers() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(Long id, User user) {
        User updateUser = entityManager.find(User.class, id);
        if (updateUser != null) {
            updateUser.setName(user.getName());
            updateUser.setSurname(user.getSurname());
            updateUser.setAge(user.getAge());
            updateUser.setEmail(user.getEmail());
            entityManager.merge(updateUser);
        }
    }

    @Override
    public void deleteUser(Long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }
}
