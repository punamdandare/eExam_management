package com.management.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.exam.entity.Option;
import com.management.exam.repository.OptionRepository;

@Service
public class OptionService {

	@Autowired
	private OptionRepository optionRepository;
	
	public Option saveOption(Option option) {
		Option save = optionRepository.save(option);
		return save;
	}
}
