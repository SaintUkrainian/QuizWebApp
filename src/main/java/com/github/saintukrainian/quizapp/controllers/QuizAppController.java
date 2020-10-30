package com.github.saintukrainian.quizapp.controllers;

import java.util.Set;

import javax.annotation.PostConstruct;

import com.github.saintukrainian.quizapp.entities.Result;
import com.github.saintukrainian.quizapp.entities.quizes.Quizes;
import com.github.saintukrainian.quizapp.entities.quizes.quiz.EnglishQuiz;
import com.github.saintukrainian.quizapp.entities.quizes.quiz.JavaQuiz;
import com.github.saintukrainian.quizapp.helper.Calculate;
import com.github.saintukrainian.quizapp.repository.ResultRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz")
public class QuizAppController {
    private Quizes quizes;
    private ResultRepository rep;

    @Autowired
    public QuizAppController(ResultRepository rep) {
        this.rep = rep;
    }

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

    @GetMapping("/selected/{name}")
    public String englishQuiz(@PathVariable String name ,Model model) {
        model.addAttribute("quiz", quizes.findQuizByName(name));
        return "quiz";
    }

    @PostMapping("/process")
    public String process(@RequestParam("answers") Set<String> usersAnswers, @RequestParam("name") String name,
            Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userName;
        if(principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        double result = Calculate.calculate(quizes.findQuizByName(name).getRightAnswers(), usersAnswers);
        model.addAttribute("result", result);
        rep.save(new Result(0, result, userName));
        return "result";
    }

}
