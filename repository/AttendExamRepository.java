package com.management.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.exam.entity.AttendExam;

public interface AttendExamRepository extends JpaRepository<AttendExam, Long>{
	
	List<AttendExam> findAllByUserId(String id);
	
	

}
