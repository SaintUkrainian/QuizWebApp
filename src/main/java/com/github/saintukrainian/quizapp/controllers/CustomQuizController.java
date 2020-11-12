package com.github.saintukrainian.quizapp.controllers;

import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.github.saintukrainian.quizapp.entities.quizcreator.CreatedQuizes;
import com.github.saintukrainian.quizapp.entities.quizcreator.QuizCreator;
import com.github.saintukrainian.quizapp.entities.quizcreator.QuizName;
import com.github.saintukrainian.quizapp.entities.quizcreator.question.QuestionCreator;
import com.github.saintukrainian.quizapp.helper.Calculate;
import com.github.saintukrainian.quizapp.repository.QuestionCreatorRepository;
import com.github.saintukrainian.quizapp.repository.QuizNamesRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/custom-quiz")
public class CustomQuizController {

    private QuizNamesRepository quizRep;
    private QuestionCreatorRepository questionRep;

    public CustomQuizController(QuizNamesRepository quizRep, QuestionCreatorRepository questionRep) {
        this.quizRep = quizRep;
        this.questionRep = questionRep;
    }

    @PostConstruct
    public void loadQuizes() {
        CreatedQuizes.setQuizNames(quizRep.findAll());
        CreatedQuizes.createQuizesByNames();
    }

    @GetMapping("/")
    public String custom(Model model) {
        model.addAttribute("customQuizes", CreatedQuizes.getCreatedQuizes());
        return "custom-quizes";
    }

    @GetMapping("/create")
    public String create() {
        return "create-quiz";
    }

    @PostMapping("/add-quiz")
    public String addQuiz(@RequestParam("quizName") String quizName) {
        quizRep.save(new QuizName(0, quizName));
        QuizCreator customQuiz = new QuizCreator(quizName);
        CreatedQuizes.getCreatedQuizes().add(customQuiz);
        return "redirect:/custom-quiz/";
    }

    @GetMapping("/selected/{name}")
    public String customQuiz(@PathVariable String name, Model model) {
        CreatedQuizes.findByName(name).setCreatedQuestions(questionRep.findAllByQuizName(name));
        model.addAttribute("quiz", CreatedQuizes.findByName(name));
        return "custom-quiz";
    }

    @GetMapping("/question/{name}")
    public String question(@PathVariable String name, Model model) {
        QuestionCreator question = new QuestionCreator();
        question.setQuizName(name);
        model.addAttribute("question", question);
        return "create-question";
    }

    @PostMapping("/add-question")
    public String addQuestion(@ModelAttribute("question") QuestionCreator question) {
        CreatedQuizes.findByName(question.getQuizName()).getCreatedQuestions().add(question);
        // CreatedQuizes.findByName(question.getQuizName()).getCreatedQuestions().add(question);
        questionRep.save(question);
        return "redirect:/custom-quiz/selected/" + question.getQuizName();
    }

    @GetMapping("/play/{quizName}")
    public String play(@PathVariable String quizName, Model model) {
        CreatedQuizes.findByName(quizName);
        model.addAttribute("quiz", CreatedQuizes.findByName(quizName));
        return "play-quiz";
    }

    @PostMapping("/result/{quizName}")
    public String results(@PathVariable String quizName, @RequestParam("answers") Set<String> usersAnswers, Model model) {
        Set<String> rightAnswers = CreatedQuizes.findByName(quizName).getCreatedQuestions().stream()
                .map(QuestionCreator::getRightAnswer).collect(Collectors.toSet());

        System.out.println("Right answers: " + rightAnswers);
        System.out.println("User answers: " + usersAnswers);
        model.addAttribute("result", Calculate.calculate(rightAnswers, usersAnswers));
        return "result";
    }
}
