package com.odinrossy.pismLab3.services;

import com.odinrossy.pismLab3.model.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> getAnswerForUser(String username);

    Answer addAnswer(Answer answer);

}
