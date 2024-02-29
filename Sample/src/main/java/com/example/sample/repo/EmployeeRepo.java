package com.example.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

}
