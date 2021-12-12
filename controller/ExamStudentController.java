package com.management.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exam.entity.ExamStudent;
import com.management.exam.service.ExamStudentService;

@RestController
@RequestMapping("/examstudent")
public class ExamStudentController {

		@Autowired
		private ExamStudentService examStudentService;
		
		@PostMapping("/")
		public ExamStudent getExamStd(@RequestBody ExamStudent examstds) {
			ExamStudent saveExamStd = examStudentService.saveExamStd(examstds);
			return saveExamStd;
	}
		
}
