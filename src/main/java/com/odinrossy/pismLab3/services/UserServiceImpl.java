package com.odinrossy.pismLab3.services;

import com.odinrossy.pismLab3.exceptions.UserNotAuthorizedException;
import com.odinrossy.pismLab3.exceptions.UserNotFoundException;
import com.odinrossy.pismLab3.exceptions.WrongUserPasswordException;
import com.odinrossy.pismLab3.model.User;
import com.odinrossy.pismLab3.repository.UserRepository;
import com.odinrossy.pismLab3.repository.UserRepositoryImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepositoryImpl();

    public void checkUserAuthorization(HttpServletRequest request) throws UserNotAuthorizedException {
        HttpSession session = request.getSession();
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null)
            throw new UserNotAuthorizedException("You are not authorized");
        request.setAttribute("username", currentUser.getUsername());
    }

    public void authorizeUser(User user, HttpSession session) throws WrongUserPasswordException {
        try {
            user = userRepository.getUser(user.getUsername(), user.getPassword());
            session.setAttribute("currentUser", user);
        } catch (UserNotFoundException e) {
            user = userRepository.createUser(user);
            if (user == null)
                throw new WrongUserPasswordException("Wrong password (Вы ввели неправильный пароль)");
            else
                session.setAttribute("currentUser", user);
        }
    }
}
