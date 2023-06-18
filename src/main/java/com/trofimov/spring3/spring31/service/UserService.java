package com.trofimov.spring3.spring31.service;

import com.trofimov.spring3.spring31.models.User;
import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    void deleteUser(Long id);

    void editUser(User user);

    User getUserById(Long id);

}
