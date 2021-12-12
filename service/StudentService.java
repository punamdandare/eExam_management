package com.management.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exam.entity.Student;
import com.management.exam.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public Student saveStd(Student std) {
		Student save = studentRepository.save(std);
		return save;
	}
}
