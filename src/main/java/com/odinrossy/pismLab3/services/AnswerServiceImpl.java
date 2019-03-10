package com.odinrossy.pismLab3.services;

import com.odinrossy.pismLab3.model.Answer;
import com.odinrossy.pismLab3.repository.AnswerRepository;
import com.odinrossy.pismLab3.repository.AnswerRepositoryImpl;

import java.util.List;

public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository = new AnswerRepositoryImpl();

    @Override
    public List<Answer> getAnswerForUser(String username) {
        if (username != null)
            return answerRepository.getAnswersForUser(username);
        throw new RuntimeException("Username is null");
    }

    @Override
    public void addAnswer(Answer answer) {
        if (answer != null) {
            answerRepository.addAnswer(answer);
            return;
        }
        throw new RuntimeException("Object of Answer is null");
    }
}
