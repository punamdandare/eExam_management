package com.management.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exam.entity.AttendExam;
import com.management.exam.repository.AttendExamRepository;

@Service
public class AttendExamService {
	
	@Autowired
	private AttendExamRepository attendExamRepository;

	public List<AttendExam> saveAttendExam(List<AttendExam> attendexam) {
		List<AttendExam> save = attendExamRepository.saveAll(attendexam);
		return save;
	}
}
