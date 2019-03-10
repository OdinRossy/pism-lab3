package com.odinrossy.pismLab3.services;

import com.odinrossy.pismLab3.model.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> getAnswerForUser(String username);

    void addAnswer(Answer answer);

}
