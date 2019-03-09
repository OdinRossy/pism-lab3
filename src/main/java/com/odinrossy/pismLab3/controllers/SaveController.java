package com.odinrossy.pismLab3.controllers;

import com.odinrossy.pismLab3.model.Answer;
import com.odinrossy.pismLab3.model.User;
import com.odinrossy.pismLab3.services.AnswerService;
import com.odinrossy.pismLab3.services.AnswerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SaveController", urlPatterns = "/save")
public class SaveController extends HttpServlet {
    private static long counter = 0;

    private final AnswerService answerService = new AnswerServiceImpl();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();

        try {
            User currentUser = (User) request.getSession().getAttribute("currentUser");
            String username = currentUser.getUsername();
            String brand = request.getParameter("brand");

            if (brand.equals("null"))
                throw new RuntimeException("Brand of auto is null (Вы не выбрали марку автомобиля)");

            String type = request.getParameter("type");
            short horsepower = Short.parseShort(request.getParameter("horsepower"));
            short fuelConsumption = Short.parseShort(request.getParameter("fuel-consumption"));
            short speed = Short.parseShort(request.getParameter("speed"));
            boolean isAutomaticTransmission = request.getParameter("transmission").equals("auto");
            boolean isFrontWheel = request.getParameter("drive").equals("front-wheel");
            String color = request.getParameter("color");
            boolean isSeatHeating = request.getParameter("seat-heating") != null;
            boolean isLeatherInterior = request.getParameter("leather-interior") != null;
            boolean hasNavigator = request.getParameter("navigation-system") != null;
            boolean hasVideoCamera = request.getParameter("video-camera") != null;
            String wishes = request.getParameter("wishes");

            Answer answer = new Answer();
            answer.setUsername(username);
            answer.setId(++counter);
            answer.setBrand(brand);
            answer.setType(type);
            answer.setHorsepower(horsepower);
            answer.setFuelConsumption(fuelConsumption);
            answer.setSpeed(speed);
            answer.setAutomaticTransmission(isAutomaticTransmission);
            answer.setFrontWheel(isFrontWheel);
            answer.setColor(color);
            answer.setSeatHeating(isSeatHeating);
            answer.setLeatherInterior(isLeatherInterior);
            answer.setHasNavigator(hasNavigator);
            answer.setHasVideoCamera(hasVideoCamera);
            answer.setWishes(wishes);

            answerService.addAnswer(answer);

            session.setAttribute("answer", answer);
            request.getRequestDispatcher("pages/saved.jsp").forward(request, response);

        } catch (Exception e) {
            session.setAttribute("errorMsg", e.getMessage());
            response.sendError(400, e.getMessage());
        }
    }
}
