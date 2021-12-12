package com.management.exam.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamStudent extends CommonBase{
	
	@OneToOne
	Student student;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Exam> exams;

}
