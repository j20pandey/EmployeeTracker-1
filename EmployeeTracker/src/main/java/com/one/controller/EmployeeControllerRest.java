package com.one.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.model.Employee;
import com.one.repository.EmployeeRepository;

@RestController
public class EmployeeControllerRest {
	
	@Autowired
	EmployeeRepository empRepo;

	
	
	@PostMapping("/addEmployeeRest")
	@ResponseBody
	public Employee addemployeeRest(@RequestBody Employee emp) {
		empRepo.save(emp);
		return emp;
	}	

	
	@PutMapping("/addEmployeeRestPut")
	@ResponseBody
	public Employee addemployeeRestPut(@RequestBody Employee emp) {
		empRepo.save(emp);
		return emp;
	}
	
	//Request Mapping to display as String , Json 
	//Maven uses Jackson API to convert entity to JSON format
	//Optional is Like LIST for Java 8 
	//REST API
	@RequestMapping("/getEmployee/{id}")
	@ResponseBody
	public Optional<Employee> getEmployee(@PathVariable("id") int input) {
		
		//System.out.println("Printing All Employee");
		return empRepo.findById(input);
	}	
	
	
	//@PathVariable // for JSON request
	
	@RequestMapping(path ="/getEmployeeJson/{id}", produces = {"application/json"})
	@ResponseBody
	public Optional<Employee> getEmployeeJson(@PathVariable("id") int input) {
		
		//System.out.println("Printing All Employee");
		return empRepo.findById(input);
	}	
		
}
