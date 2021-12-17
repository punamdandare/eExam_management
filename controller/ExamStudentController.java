package com.management.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exam.entity.ExamStudent;
import com.management.exam.repository.ExamStudentRepository;
import com.management.exam.service.ExamStudentService;

@RestController
@RequestMapping("/examstudent")
public class ExamStudentController {

	@Autowired
	private ExamStudentService examStudentService;

	@PostMapping("/{USER}/{EXAM}")
	public ExamStudent assignExamToUser(@PathVariable(value = "USER") Long userId,
			@PathVariable(value = "EXAM") Long examId) {
		ExamStudent saveExamStd = examStudentService.saveExamStd(userId, examId);
		return saveExamStd;
	}
	
	@Autowired ExamStudentRepository examStudentRepository;

	@GetMapping("/{ID}")
	public ExamStudent getExam(@PathVariable(value = "ID") Long id)
	{
		return examStudentRepository.findById(id).orElseThrow();
	}
	
}
