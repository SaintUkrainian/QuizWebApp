package com.github.saintukrainian.quizapp.controllers;

import com.github.saintukrainian.quizapp.entities.quizes.Quizes;
import com.github.saintukrainian.quizapp.repository.ResultRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private ResultRepository rep;


    @Autowired
    public MainController(ResultRepository rep) {
        this.rep = rep;
    }

   
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("quizes", Quizes.getInstance().getQuizes());
        return "home";
    }

    @GetMapping("/profile")
    public String profile(Model model){
        Object pricipal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails) pricipal).getUsername();
        model.addAttribute("results", rep.findAllByStudentNameOrderByIdDesc(username));
        return "profile";
    }
}
