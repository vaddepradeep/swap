/*package com.example.demo.dao;

import java.util.Date;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.exception.EmployeeNotFoundException;
import com.example.demo.model.EmpActive;
import com.example.demo.model.Employee;

@Repository
public class EmpRepoImpl implements EmpRepo{
	@Autowired
	private JdbcTemplate jt;
	
	static final String INSERT_EMPLOYEE="insert into bchandan.employee(employee_id,designation,firstName,lastName,location)values(?,?,?,?,?)";
	static final String GET_EMPLOYEE = "SELECT * FROM employee WHERE employee_id = ?";
	static final String INSERT_EMPLOYEE_ACTIVITY="insert into bchandan.employee_activity(employee_activity_id,swipeDateTime,isSwap,employee_id)values(?,?,?,?)";
	

	@Override
	public int save(Employee emp) {
		int rowsUpdated = jt.update(INSERT_EMPLOYEE, emp.getEmployeeId(),emp.getName(),emp.getLocation());
		return rowsUpdated;
		
	}

	@Override
	public Employee retrieveEmpById(Long employeeId) {
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		Employee employee=null;
		try {
			employee = jt.queryForObject(GET_EMPLOYEE, rowMapper, employeeId);
		}
		catch (Exception e) {
			throw new EmployeeNotFoundException("Employee not found in dao "+employeeId);
		} 
		
		return employee;
	}

	@Override
	public int saveEmployeeActivity(EmpActive empActive) {
		int rowsUpdated = jt.update(INSERT_EMPLOYEE_ACTIVITY, empActive.getEmployeeActivityId(),new Date(),empActive.getSwapActivity(),empActive.getEmployeeId());
		return rowsUpdated;
		
		
	}

}
*/
