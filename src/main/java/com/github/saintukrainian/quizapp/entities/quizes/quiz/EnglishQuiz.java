package com.github.saintukrainian.quizapp.entities.quizes.quiz;

import java.util.List;
import java.util.Set;

import com.github.saintukrainian.quizapp.entities.quizes.questions.Question;

public class EnglishQuiz implements Quiz {

    private String name;
    private List<Question> questions;
    private Set<String> rightAnswers;

    public EnglishQuiz() {
        name = "English";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public Set<String> getRightAnswers() {
        return rightAnswers;
    }

}
