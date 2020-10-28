package com.github.saintukrainian.quizapp.helper;

import java.util.Set;

public class Calculate {

    // getting the number of all wrong answers
    public static double calculate(Set<String> rightAnswers, Set<String> usersAnswers) {
        // removing all right answers
        usersAnswers.removeIf(answer -> !rightAnswers.contains(answer));
        System.out.println("---------------------");
        System.out.println(usersAnswers);
        
        return usersAnswers.size() * 100 / rightAnswers.size();
    }

}
