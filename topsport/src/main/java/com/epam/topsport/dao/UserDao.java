package com.epam.topsport.dao;

import com.epam.topsport.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User findUserByEmail(String email);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(String email);

}
