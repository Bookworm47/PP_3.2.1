package ru.pp.spring.pp321.service;



import ru.pp.spring.pp321.model.User;

import java.util.List;

public interface UserService {

    public List<User> allUsers();
    public User getUser(int id);
    public void addUser(User user);
    public void updateUser(int id,User user);
    public void deleteUser(int id);
}
