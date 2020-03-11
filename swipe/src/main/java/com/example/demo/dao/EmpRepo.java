package com.example.demo.dao;

import com.example.demo.model.EmpActive;
import com.example.demo.model.Employee;

public interface EmpRepo {
	 public int save(Employee emp );
	 public Employee retrieveEmpById(Long employeeId );
	 public int saveEmployeeActivity(EmpActive empActive);
}
