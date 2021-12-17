package com.management.exam.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
	
	@OneToOne(cascade = CascadeType.MERGE)
	Student student;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	List<Exam> exams;

}
