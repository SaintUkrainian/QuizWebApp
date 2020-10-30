package com.github.saintukrainian.quizapp.helper;

import java.util.Set;

public class Calculate {

    // getting the number of all right answers
    public static double calculate(Set<String> rightAnswers, Set<String> usersAnswers) {
        // removing all right wrong
        usersAnswers.removeIf(answer -> !rightAnswers.contains(answer));

        return usersAnswers.size() * 100 / rightAnswers.size();
    }

}
