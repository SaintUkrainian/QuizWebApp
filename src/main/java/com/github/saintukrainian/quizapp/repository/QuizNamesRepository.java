package com.github.saintukrainian.quizapp.repository;

import com.github.saintukrainian.quizapp.entities.quizcreator.QuizName;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizNamesRepository extends JpaRepository<QuizName, Integer> {
    
}
