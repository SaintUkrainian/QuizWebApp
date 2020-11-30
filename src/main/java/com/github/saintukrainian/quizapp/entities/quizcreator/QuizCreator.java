package com.github.saintukrainian.quizapp.entities.quizcreator;

import java.util.ArrayList;
import java.util.List;

import com.github.saintukrainian.quizapp.entities.quizcreator.question.QuestionCreator;

public class QuizCreator {

    private List<QuestionCreator> createdQuestions;
    private List<String> rightAnswers;

    private String quizName;

    public QuizCreator() {
    }

    public QuizCreator(String quizName) {
        this.quizName = quizName;
    }

    public List<QuestionCreator> getCreatedQuestions() {
        if (createdQuestions == null) {
            createdQuestions = new ArrayList<>();
        }
        return createdQuestions;
    }

    public List<String> getRightAnswers() {
        if (rightAnswers == null) {
            rightAnswers = new ArrayList<>();
        }
        return rightAnswers;
    }

    public void setCreatedQuestions(List<QuestionCreator> createdQuestions) {
        this.createdQuestions = createdQuestions;
    }

    public String getQuizName() {
        return this.quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }


}
