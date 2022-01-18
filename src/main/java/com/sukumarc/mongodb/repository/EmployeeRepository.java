package com.sukumarc.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sukumarc.mongodb.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}