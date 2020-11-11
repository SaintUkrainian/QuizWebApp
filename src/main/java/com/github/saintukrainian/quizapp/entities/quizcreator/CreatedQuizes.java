package com.github.saintukrainian.quizapp.entities.quizcreator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreatedQuizes {

    private static List<QuizCreator> createdQuizes;
    private static List<String> quizNames;

    public static List<QuizCreator> getCreatedQuizes() {
        if(createdQuizes == null) {
            createdQuizes = new ArrayList<>();
        }
        return createdQuizes;
    }

    public static void setQuizNames(List<QuizName> quizNames) {
        CreatedQuizes.quizNames = quizNames.stream().map(QuizName::getQuizName).collect(Collectors.toList());
    }

    public static List<String> getQuizNames() {
        return quizNames;
    }

    public static void createQuizesByNames() {
        quizNames.forEach(name -> getCreatedQuizes().add(new QuizCreator(name)));
    }

    public static QuizCreator findByName(String name) {
        return createdQuizes.stream().filter(q -> q.getQuizName().equals(name)).findFirst().get();
    }
}
