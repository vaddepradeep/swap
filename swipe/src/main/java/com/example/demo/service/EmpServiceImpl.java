package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpRepo;
import com.example.demo.model.EmpActive;
import com.example.demo.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {
@Autowired	
private EmpRepo emprepo;
	@Override
	public int save(Employee employee) {
		
		return emprepo.save(employee);
	}

	@Override
	public Employee retrieveEmployeeById(Long employeeId) {
	
		return emprepo.retrieveEmpById(employeeId);
	}

	@Override
	public int saveEmployeeActivity(EmpActive employeeActivity) {
		// TODO Auto-generated method stub
		return emprepo.saveEmployeeActivity(employeeActivity);
	}

}
