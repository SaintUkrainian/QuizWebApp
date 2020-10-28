package com.github.saintukrainian.quizapp.helper;

import java.util.Set;

public class Calculate {

    // getting the number of all wrong answers
    public static boolean calculate(Set<String> rightAnswers, Set<String> usersAnswers) {
        // removing all right answers
        usersAnswers.removeAll(rightAnswers);
        System.out.println(usersAnswers.size());
        if (usersAnswers.size() >= 10) {
            System.out.println(usersAnswers);
            System.out.println("false");
            return false;
        }
        return true;
    }

}
