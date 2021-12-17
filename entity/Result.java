package com.management.exam.entity;

import java.util.List;

import javax.persistence.Entity;

import com.management.exam.enums.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result extends CommonBase{

	private Long userID;
	private Integer totalAttemptedQuestion;
	private Integer notAttemptedQuestion;
	private Integer totalMarks;
	private Integer negativeMarks;
}
