package ru.pp.spring.pp321.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.pp.spring.pp321.dao.UserDAO;
import ru.pp.spring.pp321.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }
    @Override
    @Transactional
    public void updateUser(int id, User user) {
        userDAO.updateUser(id,user);

    }
    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);

    }
    @Override
    @Transactional
    public List<User> allUsers() {
        return userDAO.allUsers();
    }
    @Override
    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }
}
