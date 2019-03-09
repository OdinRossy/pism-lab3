package com.odinrossy.pismLab3.jspHandlers;

import com.odinrossy.pismLab3.model.Answer;
import com.odinrossy.pismLab3.model.User;
import com.odinrossy.pismLab3.services.AnswerService;
import com.odinrossy.pismLab3.services.AnswerServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class JspHandler {

    private User currentUser;

    private final AnswerService answerService = new AnswerServiceImpl();

    public JspHandler(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("errorMsg");
        if (session.getAttribute("currentUser") == null) {
            response.sendRedirect("/pism-lab3");
            currentUser = new User("undefined", "undefined");
        } else {
            currentUser = (User) session.getAttribute("currentUser");
            session.setAttribute("currentUser", currentUser);
        }
    }

    public String getUsername() {
        return currentUser.getUsername();
    }

    public String getAnswers() {
        List<Answer> answerList = answerService.getAnswerForUser(getUsername());
        StringBuilder stringBuilder = new StringBuilder();
        for (Answer answer : answerList) {
            stringBuilder.append("Анкета ").append(answer.getId()).append(" : ").append(answer).append(";/n");
        }
        return String.valueOf(stringBuilder);
    }
}