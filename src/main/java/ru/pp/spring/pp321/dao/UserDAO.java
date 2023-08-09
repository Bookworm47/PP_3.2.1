package ru.pp.spring.pp321.dao;


import ru.pp.spring.pp321.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> allUsers();
    public User getUser(Long id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(Long id);
}
