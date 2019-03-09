package com.odinrossy.pismLab3.repository;

import com.odinrossy.pismLab3.model.Answer;

import java.util.List;

public interface AnswerRepository {

    Answer getAnswer(long id);

    List<Answer> getAnswersForUser(String username);

    Answer addAnswer(Answer answer);

    Answer updateAnswer(Answer answer);

    void deleteAnswer(Answer answer);
}
