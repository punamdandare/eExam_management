package com.management.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.exam.entity.Option;

public interface OptionRepository extends JpaRepository<Option, Long>{

}
