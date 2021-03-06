package com.sukumarc.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	private Integer employeeId;
	
	private String name;
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}