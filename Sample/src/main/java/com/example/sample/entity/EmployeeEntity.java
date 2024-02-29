package com.example.sample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private long id;
  
  @Column(name="fullName")
  private String fullName;
  
  @Column(name="salary")
  private int salary;
  
  @Column(name="department")
  @OneToOne
  private DepartmentEntity department;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public DepartmentEntity getDepartment() {
	return department;
}

public void setDepartment(DepartmentEntity department) {
	this.department = department;
}
  
  
}
