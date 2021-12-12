package com.management.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.exam.entity.Option;
import com.management.exam.service.OptionService;

@RestController
@RequestMapping("/option")
public class OptionController {

		@Autowired
		private OptionService optionService;
		
		@PostMapping("/")
		public Option getOption(@RequestBody Option option) {
			Option saveOption = optionService.saveOption(option);
			return saveOption;
		}
}
