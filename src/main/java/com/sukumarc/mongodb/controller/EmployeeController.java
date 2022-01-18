package com.sukumarc.mongodb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sukumarc.mongodb.model.Employee;
import com.sukumarc.mongodb.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/mongodb")
public class EmployeeController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Employee> getAllUsers() {
		LOG.info("Getting all users");
		return employeeRepository.findAll();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Employee addNewUsers(@RequestBody Employee user) {
		LOG.info("Saving user");
		return employeeRepository.save(user);
	}

}