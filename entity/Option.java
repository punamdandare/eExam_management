package com.management.exam.entity;

import java.util.Set;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Option extends CommonBase{
	String optionName;
	Boolean isCorrect;

}
