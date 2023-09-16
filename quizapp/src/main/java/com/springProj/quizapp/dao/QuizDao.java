package com.springProj.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springProj.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer>{

}
