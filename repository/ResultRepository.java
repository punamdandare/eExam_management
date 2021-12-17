package com.management.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.exam.entity.AttendExam;
import com.management.exam.entity.Result;

public interface ResultRepository extends JpaRepository<Result, Long>{
	
	//List<AttendExam> findAllByAttendExamUserID(Long id);

}
