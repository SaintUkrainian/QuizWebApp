package com.github.saintukrainian.quizapp.entities.quizes.quiz;

import java.util.List;
import java.util.Set;

import com.github.saintukrainian.quizapp.entities.quizes.questions.Question;

public interface Quiz {

    public String getName();

    public List<Question> getQuestions();

    public Set<String> getRightAnswers();
    
}
