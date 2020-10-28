package com.github.saintukrainian.quizapp.entities.quizes;

import java.util.ArrayList;
import java.util.List;

import com.github.saintukrainian.quizapp.entities.quizes.quiz.Quiz;

public class Quizes {

    private List<Quiz> quizes;
    private static Quizes quizesObj;

    private Quizes() {
        quizes = new ArrayList<>();
    }

    public static Quizes getInstance() {
        if (quizesObj == null) {
            quizesObj = new Quizes();
        }

        return quizesObj;
    }

    public void addNewQuiz(Quiz quiz) {
        quizes.add(quiz);
    }

    public Quiz findQuizByName(String name) {
        return quizes.stream().filter(quiz -> quiz.getName().equals(name)).findFirst().get();
    }

    public List<Quiz> getQuizes() {
        return quizes;
    }
    
}
