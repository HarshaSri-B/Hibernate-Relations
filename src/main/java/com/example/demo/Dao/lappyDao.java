package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Laptop;
import com.example.demo.Entity.Student;

@Repository
public interface lappyDao extends JpaRepository<Laptop,Integer> {
	
}
