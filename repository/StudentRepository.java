package com.management.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.exam.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
