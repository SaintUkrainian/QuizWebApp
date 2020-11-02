package com.github.saintukrainian.quizapp.repository;

import java.util.List;

import com.github.saintukrainian.quizapp.entities.Result;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
    public List<Result> findAllByStudentNameOrderByIdDesc(String studentName);
}
