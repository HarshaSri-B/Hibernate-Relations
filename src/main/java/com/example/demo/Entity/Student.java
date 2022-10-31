package com.example.demo.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int studId;
	private String studName;
	private String branch;
	private String studSec;

	@OneToMany
	public List<Laptop> laptop;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, String branch, String studSec, List<Laptop> laptop) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.branch = branch;
		this.studSec = studSec;
		this.laptop = laptop;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getStudSec() {
		return studSec;
	}

	public void setStudSec(String studSec) {
		this.studSec = studSec;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
}
