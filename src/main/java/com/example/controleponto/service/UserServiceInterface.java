package com.example.controleponto.service;

import java.util.List;

import com.example.controleponto.model.Role;
import com.example.controleponto.model.User;

public interface UserServiceInterface {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
