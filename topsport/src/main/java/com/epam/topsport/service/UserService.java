package com.epam.topsport.service;

import com.epam.topsport.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User findUserByEmail(String email);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(String email);

}
