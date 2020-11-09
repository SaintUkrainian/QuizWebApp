package com.github.saintukrainian.quizapp.entities.quizcreator;

import java.util.ArrayList;
import java.util.List;

public class CreatedQuizes {

    private static List<QuizCreator> createdQuizes;

    public static List<QuizCreator> getCreatedQuizes() {
        if(createdQuizes == null) {
            createdQuizes = new ArrayList<>();
        }
        return createdQuizes;
    }

    public static QuizCreator findByName(String name) {
        return createdQuizes.stream().filter(q -> q.getQuizName().equals(name)).findFirst().get();
    }
}
