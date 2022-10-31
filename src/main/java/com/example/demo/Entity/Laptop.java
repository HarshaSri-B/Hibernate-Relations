package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@GeneratedValue
	private int lapId;
	private String lapModel;
	private String lapName;
	
//	@OneToOne
//	Student student;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lapId, String lapModel, String lapName) {
		super();
		this.lapId = lapId;
		this.lapModel = lapModel;
		this.lapName = lapName;
	}

	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

	public String getLapModel() {
		return lapModel;
	}

	public void setLapModel(String lapModel) {
		this.lapModel = lapModel;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

}
