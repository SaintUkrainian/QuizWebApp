package com.github.saintukrainian.quizapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import com.github.saintukrainian.quizapp.entity.Question;
import com.github.saintukrainian.quizapp.helper.Calculate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuizAppController {
    private Question questionsData;

    @PostConstruct
    public void loadData() {
        questionsData = new Question();
        List<Question> list = new ArrayList<>();
        list.add(new Question("#1) What is JAVA?", "coocking machine", "platform-independent programming language",
                "coffee mug", "low-level programming language"));
        list.add(new Question("#2) What are the features in JAVA?", "object-oriented language", "Multi-threaded",
                "platform-independent", "high-performance"));
        list.add(new Question("#3) How does Java enable high performance?", "it uses just in time compiler",
                "god helps", "you should wait 10 sec, until it starts compiling", "don't know"));
        list.add(new Question("#4) Name the Java IDE’s?", "Intellij", "NetBeans", "VS Code", "Atom"));
        list.add(new Question("#5) What do you mean by Constructor?", "it's a method for collecting garbage",
                "it's a method for getting hash code of element", "it's a method for getting sum of elements",
                "it's a method with a class name, which is used to create objects"));
        list.add(new Question("#6) What is meant by the Local variable and the Instance variable?",
                "they are defined in method scope", "they are defined inside the class",
                "they are defined inside the package", "they are not defined"));
        list.add(new Question("#7) What is a Class?", "it's a template which describes object's behavior and state",
                "it's a class at school", "it's an instance of object", "it's an object itself"));
        list.add(new Question("#8) What is an Object?", "it's an instance of class", "it's an object inside your house",
                "it's your cat", "it's a class itself"));
        list.add(new Question("#9) What are the OOPs concepts?", "inheritance", "polymorphism", "encapsulation",
                "abstraction"));
        list.add(new Question("#10) What is Inheritance?",
                "it's a relationship between classes where one extends another", "It's dull thing",
                "it's a mechanism which helps us to create methods", "i don't know"));
        list.add(new Question("#11) What is Encapsulation?", "mechanism for overloading methods",
                "mechanism for securing fields inside  methods (getters/setters)",
                "mechanism which protects fields from the class", "i don't know"));
        list.add(new Question("#12) What is Polymorphism?",
                "mechanism for overriding methods inside inheritance hierarchy", "mechanism for creating methods",
                "mechanism for creating classes", "i don't know"));
        list.add(new Question("#13) What is meant by Method Overriding?", "it's meant to create classes",
                "it's meant to create methods",
                "it's meant to recreate methods with the same signature and with the same or different sets of params",
                "i don't know"));
        list.add(new Question("#14) What is meant by Overloading?",
                "it's is meant to create methods inside the class with the same signature but with different sets of params",
                "answ2", "answ3", "i don't know"));
        list.add(new Question("#15) What is meant by Interface?", "it's a set of instructions for class", "answ2",
                "answ3", "i don't know"));
        list.add(new Question("#16) What is meant by Abstract class?",
                "Abstract class is a class which describes entity", "answ2", "answ3", "i don't know"));
        list.add(new Question("#17) Difference between Array and Array List.",
                "Array - can't be resized dinamicly, ArrayList - can be", "answ2", "answ3", "i don't know"));
        list.add(new Question("#18) Difference between String, String Builder, and String Buffer.",
                "String exists in a constant string pool, Builder and Buffer exist in stack", "answ2", "answ3",
                "i don't know"));
        list.add(new Question("#19) Explain about Public and Private access specifiers.",
                "Public - can be accessed anywhere, Private - only inside the class", "answ2", "answ3",
                "i don't know"));
        list.add(new Question("#20) Difference between Default and Protected access specifiers.",
                "default - inside the package, protected - can be accessed outside the package by inheritance", "answ2",
                "answ3", "i don't know"));

        questionsData.setQuestions(list);
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("questionsData", questionsData.getQuestions());
        return "quiz";
    }

    @PostMapping("/process")
    public String process(@RequestParam("answers") Set<String> usersAnswers, Model model) {

        System.out.println(usersAnswers);
        if(usersAnswers.size() < 20) {
            model.addAttribute("result", "You answered not enough!");
        } else if(Calculate.calculate(questionsData.getRightAnswers(), usersAnswers)){
             model.addAttribute("result", "You passed!");
        } else {
            model.addAttribute("result", "You didn't pass :(");
        }

        return "some";
    }

}
