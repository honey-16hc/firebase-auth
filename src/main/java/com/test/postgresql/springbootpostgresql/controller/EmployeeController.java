package com.test.postgresql.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.postgresql.springbootpostgresql.model.Employee;
import com.test.postgresql.springbootpostgresql.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAll()
	{
		return employeeRepository.findAll();
	}
	
	@PostMapping("/employees")
	public String saveData(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
		return "Save success";
	}
}
