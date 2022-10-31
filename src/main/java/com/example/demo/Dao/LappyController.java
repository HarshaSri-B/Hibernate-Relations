package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Laptop;

@RestController
public class LappyController {
	
	@Autowired
	lappyDao lappydao;
	
	@GetMapping("/getLaptopDetails")
	public List<Laptop> getLappyDetails(){
		return lappydao.findAll();
	}
	
	@PostMapping("/saveLappyDetails")
	public String saveLappy(@RequestBody Laptop l) {
		lappydao.save(l);
		return "details are saved";
	}
	
	@DeleteMapping("/deleteLappyDetails")
	public String deleteLappy() {
		lappydao.deleteAll();
		return "values are deleted";
	}
}
