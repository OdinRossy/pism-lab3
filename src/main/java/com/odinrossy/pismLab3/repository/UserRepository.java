package com.odinrossy.pismLab3.repository;

import com.odinrossy.pismLab3.model.User;

public interface UserRepository {

    User getUser(String username);

    User getUser(String username, String password);

    User createUser(User user);
}
