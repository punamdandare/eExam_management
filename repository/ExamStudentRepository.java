package com.management.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.exam.entity.ExamStudent;

public interface ExamStudentRepository extends JpaRepository<ExamStudent, Long>{

}
