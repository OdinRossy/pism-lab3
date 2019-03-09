package com.odinrossy.pismLab3.services;

import com.odinrossy.pismLab3.model.User;

import javax.servlet.http.HttpSession;

public interface UserService {

    void authorizeUser(User user, HttpSession session);

}
