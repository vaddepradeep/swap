package com.example.demo.service;

import com.example.demo.model.EmpActive;
import com.example.demo.model.Employee;

public interface EmpService {
	public int save(Employee employee );
	public Employee retrieveEmployeeById(Long employeeId );
	public int saveEmployeeActivity(EmpActive employeeActivity);

}
