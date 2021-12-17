package com.management.exam.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exam.entity.AttendExam;
import com.management.exam.entity.Exam;
import com.management.exam.entity.Option;
import com.management.exam.entity.Question;
import com.management.exam.entity.Result;
import com.management.exam.enums.QuestionType;
import com.management.exam.repository.AttendExamRepository;
import com.management.exam.repository.ExamRepository;
import com.management.exam.repository.QuestionRepository;
import com.management.exam.repository.ResultRepository;

@Service
public class ResultService {

	@Autowired
	private ResultRepository resultRepository;
	
	@Autowired
	private AttendExamRepository attendExamRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private ExamRepository examRepository;
	
	public Result findAll(String id){
		List<AttendExam> findAllByAttendExamUserID =attendExamRepository.findAllByUserId(id);
	
		Integer mark = 0;
		
		Integer attemptedQuestion=0;
		
		Exam exam = examRepository.findById(Long.parseLong(findAllByAttendExamUserID.get(0).getExamId())).orElseThrow();
		Integer totalQuestionCount= exam.getQuestions().size();
		Long userId = null;
		
		for(AttendExam attendExam : findAllByAttendExamUserID)
		{
			//Databse store actual question
			 Long questionId = Long.parseLong(attendExam.getQuestionId());
			 Question question = questionRepository.findById(questionId).orElseThrow();
			 
			 //check type of question
			 QuestionType questionType = attendExam.getQuestionType();
			 
			 
			 userId = Long.parseLong(attendExam.getUserId());
			 
			 if(questionType.equals(QuestionType.RADIO_BUTTON))
			 {
				 //while giving exam user select this option
				 List<Option> selectedOption = attendExam.getSelectedOption();
				 
				 //user selected option
				 Option option = selectedOption.get(0);
				
				//check selected option with db
				 for(Option dbOpt : question.getOptions())
				 {
					 //
					 
					 if(dbOpt.getOptionName().equals(option.getOptionName()) && dbOpt.getIsCorrect() == true)
					 {
						 mark = mark + question.getMark();
					 }
				 }
				 
				 
			 }
			 else {
				 
				 //TODO add checkbox logic

				 Boolean isCorrectResult = false;
				 
				 for(Option dbOption : question.getOptions()) { //db option
					 for(Option selOption : attendExam.getSelectedOption()) { // selected option
						
						 
						 if(dbOption.getOptionName().equals(selOption.getOptionName()) && dbOption.getIsCorrect() == true)
						 {
							 isCorrectResult = true;
						 }
						 else if(dbOption.getOptionName().equals(selOption.getOptionName()) && dbOption.getIsCorrect() == false)
						 {
							 isCorrectResult =  false;
						 }

						 
					 }
				 }
			 }
			 attemptedQuestion = attemptedQuestion + 1;
		}
		
		Result result = new Result();
		
		result.setNotAttemptedQuestion(totalQuestionCount - attemptedQuestion);
		result.setTotalAttemptedQuestion(attemptedQuestion);
		result.setTotalMarks(mark);

		result.setUserID(userId);
		
		Result save = resultRepository.save(result);
		
		
		return save;
	}
}
