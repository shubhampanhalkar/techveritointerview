package com.example.sample.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.sample.entity.EmployeeEntity;
import com.example.sample.model.EmployeeRequestOrResponse;
import com.example.sample.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	ModelMapper modelMapper;

	public ResponseEntity<EmployeeRequestOrResponse> saveEmployee(EmployeeRequestOrResponse employeeRequest){
	    
		EmployeeEntity employee = modelMapper.map(employeeRequest,EmployeeEntity.class);
		
		EmployeeEntity savedEmployee = employeeRepo.save(employee);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(savedEmployee,EmployeeRequestOrResponse.class));
	}
	
	//return List<Names> from Employees
	
	public List<String> getAllEmployeeNames(){
		List<EmployeeEntity> employees = employeeRepo.findAll();
		
		return employees.stream().map(employee -> employee.getFullName()).collect(Collectors.toList());
	}
	
	//return List<Employees> whose salary is greaterthan given amount.
	
	
	public List<EmployeeEntity> getAllEmployeeWithGreaterSalaries(int salary){
		List<EmployeeEntity> employees = employeeRepo.findAll();
		
		return employees.stream().filter(employee -> employee.getSalary() > salary ).collect(Collectors.toList());
	}
	
	//return Employees grouped by Department and sort their salary in des
	
//	public Map<Department,List<EmployeeEntity>> getAllEmployeeByDepartment(){
//		List<EmployeeEntity> employees = employeeRepo.findAll();
//		
//		return employees.stream().sorted().collect(Collectors.groupingBy(employee -> employee.getDepartment()));
//	}
//	
	
	
	
}
