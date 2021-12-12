package com.management.exam.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@NoArgsConstructor
@AllArgsConstructor
public class Exam extends CommonBase {

	String name;
	Boolean isNegative;
	String timer;

	@OneToMany(cascade = CascadeType.ALL)
	Set<Question> questions;

}
