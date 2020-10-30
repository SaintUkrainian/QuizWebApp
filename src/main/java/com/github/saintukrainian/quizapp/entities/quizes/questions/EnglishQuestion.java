package com.github.saintukrainian.quizapp.entities.quizes.questions;

public class EnglishQuestion implements Question {

    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourthAnswer;

    public EnglishQuestion(String question, String firstAnswer, String secondAnswer, String thirdAnswer,
            String fourthAnswer) {
        this.question = question;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
    }

    @Override
    public String getFirstAnswer() {
        return firstAnswer;
    }

    @Override
    public String getFourthAnswer() {
        return fourthAnswer;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getSecondAnswer() {
        return secondAnswer;
    }

    @Override
    public String getThirdAnswer() {
        return thirdAnswer;
    }

}
