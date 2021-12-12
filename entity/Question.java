package com.management.exam.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import com.management.exam.enums.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question extends CommonBase {
	
	@Enumerated(EnumType.STRING)
	QuestionType questionType;
	String question;
	Integer mark;
	@OneToMany(cascade = CascadeType.ALL)
	Set<Option> options;
	

}
