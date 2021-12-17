package com.management.exam.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exam.entity.Exam;
import com.management.exam.entity.ExamStudent;
import com.management.exam.entity.Student;
import com.management.exam.repository.ExamRepository;
import com.management.exam.repository.ExamStudentRepository;
import com.management.exam.repository.StudentRepository;

@Service
public class ExamStudentService {

		@Autowired
		private ExamStudentRepository examStudentRepository;
		
		@Autowired private StudentRepository studentRepository;
		
		@Autowired private ExamRepository examRepository;
		
//		public ExamStudent saveExamStd(ExamStudent examstd) {
//			ExamStudent save = examStudentRepository.save(examstd);
//			return save;
//		}

		@Transactional(value = TxType.REQUIRED)
		public ExamStudent saveExamStd(Long userId, Long examId) {
			Student student = studentRepository.findById(userId).orElseThrow();
			Exam exam = examRepository.findById(examId).orElseThrow();
			
//			List<Exam> asList = Arrays.asList(exam);
			
			List<Exam> exams = new ArrayList<>();
			exams.add(exam);
			
//			Exam e = new Exam();
//			e.setId(exam.getId());
//			
//			Student s =  new Student();
//			s.setId(student.getId());
//			
//			ExamStudent examStudent = new ExamStudent();
//			examStudent.setExams(Arrays.asList(e));
//			examStudent.setStudent(s);
//			examStudent.setIsDeleted(Boolean.FALSE);
			
			ExamStudent examStudent = new ExamStudent();
			examStudent.setExams(Arrays.asList(exam));
			examStudent.setStudent(student);
			examStudent.setIsDeleted(Boolean.FALSE);
			
			ExamStudent save = examStudentRepository.save(examStudent);
			
			return save;
		}
}
