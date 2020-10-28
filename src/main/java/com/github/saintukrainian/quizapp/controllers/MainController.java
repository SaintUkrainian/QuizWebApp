package com.github.saintukrainian.quizapp.controllers;

import javax.annotation.PostConstruct;

import com.github.saintukrainian.quizapp.entities.quizes.Quizes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

   
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("quizes", Quizes.getInstance().getQuizes());
        return "home";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
}
