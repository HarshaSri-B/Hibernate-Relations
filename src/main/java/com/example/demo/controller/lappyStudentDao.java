package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Student;

@Repository
public interface lappyStudentDao extends JpaRepository<Student,Integer>{
	

}
