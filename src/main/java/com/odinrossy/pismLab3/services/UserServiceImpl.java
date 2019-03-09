package com.odinrossy.pismLab3.services;

import com.odinrossy.pismLab3.exceptions.UserNotFoundException;
import com.odinrossy.pismLab3.exceptions.WrongUserPasswordException;
import com.odinrossy.pismLab3.model.User;
import com.odinrossy.pismLab3.repository.UserRepository;
import com.odinrossy.pismLab3.repository.UserRepositoryImpl;

import javax.servlet.http.HttpSession;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository = new UserRepositoryImpl();

    public void authorizeUser(User user, HttpSession session) {
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
