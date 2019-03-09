package com.odinrossy.pismLab3.services;

import com.odinrossy.pismLab3.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface UserService {

    void checkUserAuthorization(HttpServletRequest request);

    void authorizeUser(User user, HttpSession session);

}
