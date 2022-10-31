package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;

@RestController
public class relationController {
	
	@Autowired
	lappyStudentDao lappystudentDao;
	
	@GetMapping("/PrintStudentDetails")
	public List<Student> getStudent(){
		return lappystudentDao.findAll();
	}
	
	@GetMapping("/PrintStudentBy/{Id}")
	public Optional<Student> getStudentById(@PathVariable int Id) {
		return lappystudentDao.findById(Id);
	}
	
	@PostMapping("/SaveStudentDetails")
	public String saveStudent(@RequestBody Student s) {
		lappystudentDao.save(s);
		return "Details are saved";
	}
	
	@PutMapping("/updateStudentDetails")
	public String updateStudent(@RequestBody Student s) {
		lappystudentDao.save(s);
		return "updated student details";
	}
	
	@DeleteMapping("/deleteStudentBy/{Id}")
	public String deleteStudentById(@PathVariable int Id) {
		lappystudentDao.deleteById(Id);
		return  "Deleted a student";
	}
}
