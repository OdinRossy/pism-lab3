package com.odinrossy.pismLab3.controllers;

import com.odinrossy.pismLab3.exceptions.UserNotAuthorizedException;
import com.odinrossy.pismLab3.services.UserService;
import com.odinrossy.pismLab3.services.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QuestionController", urlPatterns = "/questions")
public class QuestionController extends HttpServlet {

    private final UserService userService = new UserServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            userService.checkUserAuthorization(request);
            request.getRequestDispatcher("pages/questions.jsp").forward(request,response);
        } catch (UserNotAuthorizedException e) {
            response.sendRedirect("/pism-lab3/");
        } catch (Exception e) {
            request.setAttribute("errorMessage", e.getMessage());
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        }
    }
}
