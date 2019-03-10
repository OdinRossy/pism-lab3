package com.odinrossy.pismLab3.controllers;

import com.odinrossy.pismLab3.exceptions.UserNotAuthorizedException;
import com.odinrossy.pismLab3.model.Answer;
import com.odinrossy.pismLab3.model.User;
import com.odinrossy.pismLab3.services.AnswerService;
import com.odinrossy.pismLab3.services.AnswerServiceImpl;
import com.odinrossy.pismLab3.services.UserService;
import com.odinrossy.pismLab3.services.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AnswersController", urlPatterns = "/answers")
public class AnswersController extends HttpServlet {

    private final AnswerService answerService = new AnswerServiceImpl();
    private final UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            userService.checkUserAuthorization(request);
            HttpSession session = request.getSession();
            List<Answer> answerList = answerService.getAnswerForUser(((User) session.getAttribute("currentUser")).getUsername());
            request.setAttribute("answers", answerList);
            request.getRequestDispatcher("pages/answers.jsp").forward(request, response);
        } catch (UserNotAuthorizedException e) {
            response.sendRedirect("/pism-lab3/");
        } catch (Exception e) {
            response.sendError(400, e.getMessage());
        }
    }
}

