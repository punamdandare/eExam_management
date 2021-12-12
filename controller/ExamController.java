package com.management.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exam.entity.Exam;
import com.management.exam.service.ExamService;

@RestController
@RequestMapping("/exam")
public class ExamController {

		@Autowired
		private ExamService examService;
		
		@PostMapping("/")
		public Exam saveExam(@RequestBody Exam exams) {
			Exam saveAllExam = examService.saveAllExam(exams);
			return saveAllExam;
		}
		
		@GetMapping("/")
		public List<Exam> getAllExams(){
			List<Exam> allExam = examService.getAllExam();
			return allExam;
		}
}
