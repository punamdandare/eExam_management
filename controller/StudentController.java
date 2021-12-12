package com.management.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exam.entity.Student;
import com.management.exam.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

		@Autowired
		private StudentService studentService;
		
		@PostMapping("/")
		public Student getStudents(@RequestBody Student std) {
			Student saveStd = studentService.saveStd(std);
			return saveStd;
			
		}
}
