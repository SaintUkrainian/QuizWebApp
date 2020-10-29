package com.github.saintukrainian.quizapp.controllers;

import java.util.Set;

import javax.annotation.PostConstruct;

import com.github.saintukrainian.quizapp.entities.quizes.Quizes;
import com.github.saintukrainian.quizapp.entities.quizes.quiz.EnglishQuiz;
import com.github.saintukrainian.quizapp.entities.quizes.quiz.JavaQuiz;
import com.github.saintukrainian.quizapp.helper.Calculate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz")
public class QuizAppController {
    private Quizes quizes;

    @ExceptionHandler
    public String handle(RuntimeException e) {
        return "error";
    }

    @ExceptionHandler
    public String handle(MissingServletRequestParameterException e) {
        return "redirect:/";
    }

    @PostConstruct
    public void loadData() {
        quizes = Quizes.getInstance();
        quizes.addNewQuiz(new JavaQuiz());
        quizes.addNewQuiz(new EnglishQuiz());
    }

    @GetMapping("/Java")
    public String javaQuiz(Model model) {
        model.addAttribute("quiz", quizes.findQuizByName("Java"));
        return "quiz";
    }

    @GetMapping("/English")
    public String englishQuiz(Model model) {
        model.addAttribute("quiz", quizes.findQuizByName("English"));
        return "quiz";
    }

    @PostMapping("/process")
    public String process(@RequestParam("answers") Set<String> usersAnswers, @RequestParam("name") String name,
            Model model) {
        model.addAttribute("result", Calculate.calculate(quizes.findQuizByName(name).getRightAnswers(), usersAnswers));
        return "result";
    }

}
