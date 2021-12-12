package com.management.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.exam.entity.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long>{

}
