package com.github.saintukrainian.quizapp.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question {

    private List<Question> questions;
    private Set<String> rightAnswers;

    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourthAnswer;

    public Question() {
        questions = new ArrayList<>();
        rightAnswers = new HashSet<>();
        rightAnswers.add("platform-independent programming language");
        rightAnswers.add("object-oriented language");
        rightAnswers.add("Multi-threaded");
        rightAnswers.add("platform-independent");
        rightAnswers.add("high-performance");
        rightAnswers.add("it uses just in time compiler");
        rightAnswers.add("Intellij");
        rightAnswers.add("NetBeans");
        rightAnswers.add("it's a method with a class name, which is used to create objects");
        rightAnswers.add("it's a template which describes object's behavior and state");
        rightAnswers.add("it's an instance of class");
        rightAnswers.add("inheritance");
        rightAnswers.add("polymorphism");
        rightAnswers.add("encapsulation");
        rightAnswers.add("abstraction");
        rightAnswers.add("local variable is defined inside a method scope, instance - inside the class");
        rightAnswers.add("it's a relationship between classes where one extends another");
        rightAnswers.add("mechanism for securing fields inside  methods (getters/setters)");
        rightAnswers.add("mechanism for overriding methods inside inheritance hierarchy");
        rightAnswers.add("it's meant to recreate methods with the same signature and with the same or different sets of params");
        rightAnswers.add("it's is meant to create methods inside the class with the same signature but with different sets of params");
        rightAnswers.add("it's a set of instructions for class");
        rightAnswers.add("Abstract class is a class which describes entity");
        rightAnswers.add("Array - can't be resized dinamicly, ArrayList - can be");
        rightAnswers.add("String exists in a constant string pool, Builder and Buffer exist in stack");
        rightAnswers.add("Public - can be accessed anywhere, Private - only inside the class");
        rightAnswers.add("default - inside the package, protected - can be accessed outside the package by inheritance");
    }


    public Question(String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer) {
        this.question = question;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
    }


    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Set<String> getRightAnswers() {
        return rightAnswers;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirstAnswer() {
        return this.firstAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public String getSecondAnswer() {
        return this.secondAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public String getThirdAnswer() {
        return this.thirdAnswer;
    }

    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    public String getFourthAnswer() {
        return this.fourthAnswer;
    }

    public void setFourthAnswer(String fourthAnswer) {
        this.fourthAnswer = fourthAnswer;
    }

    @Override
    public String toString() {
        return "{" +
                " question='" + getQuestion() + "'" +
                ", firstAnswer='" + getFirstAnswer() + "'" +
                ", secondAnswer='" + getSecondAnswer() + "'" +
                ", thirdAnswer='" + getThirdAnswer() + "'" +
                ", fourthAnswer='" + getFourthAnswer() + "'" +
                "}";
    }


}
