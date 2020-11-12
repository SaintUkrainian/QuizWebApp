package com.github.saintukrainian.quizapp.entities.quizcreator.question;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question_creator")
public class QuestionCreator {


    @Column(name = "quiz_name")
    private String quizName;

    @Id
    @Column(name="question")
    private String question;

    @Column(name = "first_answer")
    private String firstAnswer;

    @Column(name = "second_answer")
    private String secondAnswer;

    @Column(name = "third_answer")
    private String thirdAnswer;

    @Column(name = "fourth_answer")
    private String fourthAnswer;

    @Column(name = "right_answer")
    private String rightAnswer;

    public QuestionCreator() {}

    public QuestionCreator(String quizName, String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer, String rightAnswer) {
        this.quizName = quizName;
        this.question = question;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
        this.rightAnswer = rightAnswer;
    }

    public String getQuizName() {
        return this.quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
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

    public String getRightAnswer() {
        return this.rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }


    @Override
    public String toString() {
        return "{" +
            "quizName='" + getQuizName() + "'" +
            ", question='" + getQuestion() + "'" +
            ", firstAnswer='" + getFirstAnswer() + "'" +
            ", secondAnswer='" + getSecondAnswer() + "'" +
            ", thirdAnswer='" + getThirdAnswer() + "'" +
            ", fourthAnswer='" + getFourthAnswer() + "'" +
            ", rightAnswer='" + getRightAnswer() + "'" +
            "}";
    }
    
}
