package com.example.sample.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EmployeeRequestOrResponse {
	
	  private long id;
	  
	  private String fullName;
	  
	  private int salary;
	  
	  private String department;
}
