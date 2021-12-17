package com.management.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.exam.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
