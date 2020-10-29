package com.github.saintukrainian.quizapp.entities.quizes.quiz;

import java.util.List;
import java.util.Set;

import com.github.saintukrainian.quizapp.entities.quizes.questions.Question;

public class EnglishQuiz implements Quiz {

    private String name;


    public EnglishQuiz() {
        name = "English";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Question> getQuestions() {
        
        return null;
    }

    @Override
    public Set<String> getRightAnswers() {
        
        return null;
    }
    
}
