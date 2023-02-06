package com.example.learn.learnjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn.learnjpa.database.EmployeeRepository;
import com.example.learn.learnjpa.entity.Employee;

@Service
public class EmployeeService<T> {
	
	@Autowired
	private EmployeeRepository<T> employeeRepository;
	public List<T> getEmployees() {
		return employeeRepository.findAll();
		
	}
		
}
