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
    public void addUser(User user) {
        userDAO.addUser(user);
    }
    @Override
    public void updateUser(Long id, User user) {
        userDAO.updateUser(id,user);

    }
    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);

    }
    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Override
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }
}
