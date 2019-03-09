package com.odinrossy.pismLab3.controllers;

import com.odinrossy.pismLab3.model.User;
import com.odinrossy.pismLab3.services.UserService;
import com.odinrossy.pismLab3.services.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AuthenticationController", urlPatterns = "/authentication")
public class AuthenticationController extends HttpServlet {

    private final UserService userService = new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("email");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();

        try {
            if ((username == null || username.trim().equals("")) || (password == null || password.trim().equals("")))
                throw new RuntimeException("Email or password is null (Вы не ввели email или пароль)");

            userService.authorizeUser(new User(username, password), session);
            response.sendRedirect("profile");
        } catch (Exception e) {
            session.setAttribute("errorMsg", e.getMessage());
            response.sendError(400, e.getMessage());
        }
    }
}
