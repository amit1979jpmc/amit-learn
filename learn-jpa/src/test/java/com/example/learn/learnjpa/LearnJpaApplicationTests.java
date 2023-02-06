package com.example.learn.learnjpa;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.learn.learnjpa.service.EmployeeService;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes= TestConfig.class)
public class LearnJpaApplicationTests {
	@Autowired
	private EmployeeService employeeService;
	@Test
	public void contextLoads() {
		System.out.println("hello");
		//employeeService.getEmployees();
	}

}
