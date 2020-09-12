package com.github.saintukrainian.quizapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRestController {
    
    @PostMapping("/user")
    public void getUsername(@RequestBody Object username){
        System.out.println(username);
    }

    @PostMapping("/users")
    public void getUsernames(@RequestBody String username){
        System.out.println(username);
    }



}
