package com.github.saintukrainian.quizapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "results")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "result")
    private double result;

    @Column(name = "student_name")
    private String studentName;

    public Result() {
    }

    public Result(Integer id, double result, String studentName) {
        this.id = id;
        this.result = result;
        this.studentName = studentName;
    }

    public Integer getId() {
        return id;
    }

    public double getResult() {
        return result;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
