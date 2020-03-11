package com.example.demo.dao.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeDao {
	@Id
	private Long employeeId;
	@Column
	private String name;
	@Column
	private String location;

}
