package com.intelligix.serverproductmanagement.service;

import com.intelligix.serverproductmanagement.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User obj);

    User updateUser(User obj);

    void deleteUser(Long id);

    User findByUsername(String username);

    List<User> findAllUsers();

    Long numberOfUsers();
}
