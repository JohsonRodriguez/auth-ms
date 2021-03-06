package com.lordbyron.auth.service;

import com.lordbyron.auth.model.Employee;
import com.lordbyron.auth.model.Role;

import java.util.List;

public interface UserService {
    Employee saveUser(Employee user);
    Role saveRole (Role role);
    void addRoleToUser(String username, String roleName);
    Employee getUser(String username);
    List<Employee> getUsers();
}
