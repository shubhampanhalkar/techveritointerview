package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.EmployeeRequestOrResponse;
import com.example.sample.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee/")
	public ResponseEntity<EmployeeRequestOrResponse> saveEmployee(@RequestBody EmployeeRequestOrResponse employee){
		return employeeService.saveEmployee(employee);
	}

}
