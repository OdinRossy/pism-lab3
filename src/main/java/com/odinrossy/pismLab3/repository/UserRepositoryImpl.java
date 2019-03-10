package com.odinrossy.pismLab3.repository;

import com.odinrossy.pismLab3.exceptions.UserNotFoundException;
import com.odinrossy.pismLab3.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private List<User> userList = new ArrayList<>();

    {
        userList.add(new User("gleebka47@gmail.com", "qwerty"));
        userList.add(new User("gleebka@icloud.com", "iCloud"));
        userList.add(new User("remniov.work@gmail.com", "work"));
    }

    private boolean checkForDuplicates(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username))
                return true;
        }
        return false;
    }

    @Override
    public User getUser(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username))
                return user;
        }
        throw new UserNotFoundException("Can't find user with username: " + username);
    }

    @Override
    public User getUser(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                return user;
        }
        throw new UserNotFoundException("Can't find user with username: " + username + " and password: " + password);
    }

    @Override
    public User createUser(User user) {
        if (user != null && !checkForDuplicates(user.getUsername())) {
            userList.add(user);
            return user;
        } else
            return null;
    }
}
