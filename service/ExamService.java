package com.management.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exam.entity.Exam;
import com.management.exam.repository.ExamRepository;

@Service
public class ExamService {
	@Autowired
	private ExamRepository examRepository;
	
	public Exam saveAllExam(Exam exam) {
		Exam save = examRepository.save(exam);
		return save;
	}
	
	public List<Exam> getAllExam(){
		List<Exam> findAll = examRepository.findAll();
		return findAll;
	}
}
