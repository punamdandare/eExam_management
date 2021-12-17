package com.management.exam.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;

import com.management.exam.enums.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendExam extends CommonBase {

	private String userId;
	private String examId;
	private String questionId;
	@Enumerated(EnumType.STRING)
	private QuestionType questionType;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Option> selectedOption;
}
