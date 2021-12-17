package com.management.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exam.entity.AttendExam;
import com.management.exam.service.AttendExamService;
@RestController
@RequestMapping("/attend")
public class AttendExamController {

	@Autowired
	private AttendExamService attendExamService;
	
	@PostMapping("/")
	public List<AttendExam> getAttendExam(@RequestBody List<AttendExam> exam) {
		List<AttendExam> saveAttendExam = attendExamService.saveAttendExam(exam);
		return saveAttendExam;
	}
	
}
