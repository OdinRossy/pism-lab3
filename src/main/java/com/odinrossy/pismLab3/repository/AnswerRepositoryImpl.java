package com.odinrossy.pismLab3.repository;

import com.odinrossy.pismLab3.exceptions.AnswerNotFoundException;
import com.odinrossy.pismLab3.model.Answer;

import java.util.ArrayList;
import java.util.List;

public class AnswerRepositoryImpl implements AnswerRepository {

    private static List<Answer> answerList = new ArrayList<>();


    @Override
    public Answer getAnswer(long id) throws AnswerNotFoundException{
        for (Answer answer : answerList) {
            if (answer.getId() == id)
                return answer;
        }
        throw new AnswerNotFoundException("Can't find answer with id: " + id);
    }

    @Override
    public List<Answer> getAnswersForUser(String username) {
        List<Answer> answersForUser = new ArrayList<>();
        for (Answer answer : answerList) {
            if (answer.getUsername().equals(username))
                answersForUser.add(answer);
        }
        return answersForUser;
    }

    @Override
    public Answer addAnswer(Answer answer) {
        answerList.add(answer);
        return answer;
    }

    @Override
    public Answer updateAnswer(Answer answer) {
        return null;
    }

    @Override
    public void deleteAnswer(Answer answer) {
        answerList.remove(answer);
    }
}
