package com.github.saintukrainian.quizapp.repository;

import java.util.List;

import com.github.saintukrainian.quizapp.entities.quizcreator.question.QuestionCreator;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionCreatorRepository extends JpaRepository<QuestionCreator, String> {

    public List<QuestionCreator> findAllByQuizName(String quizName);
    
}
