package com.management.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exam.entity.ExamStudent;
import com.management.exam.repository.ExamStudentRepository;

@Service
public class ExamStudentService {

		@Autowired
		private ExamStudentRepository examStudentRepository;
		
		public ExamStudent saveExamStd(ExamStudent examstd) {
			ExamStudent save = examStudentRepository.save(examstd);
			return save;
		}
}
