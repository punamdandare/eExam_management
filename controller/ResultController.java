package com.management.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exam.entity.AttendExam;
import com.management.exam.entity.Result;
import com.management.exam.service.AttendExamService;
import com.management.exam.service.ResultService;

@RestController
@RequestMapping("/result")
public class ResultController {

	@Autowired
	private ResultService resultService;
	
	@Autowired
	private AttendExamService attendExamService;
	
	@GetMapping("/{ID}")
	public Result getAttendExam(@PathVariable(value = "ID") String id){
		Result findAll = resultService.findAll(id);
		return findAll;
	}
}
