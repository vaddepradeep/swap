package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@RestController
public class UserControlller {
	@Autowired
	private UserService userservice;
	
	
	
	@RequestMapping(value = "/create",method = RequestMethod.POST)
	public void createUser( UserDto dto)
	{
		UserDao userdao= new UserDao();
		BeanUtils.copyProperties( dto,userdao );
		userservice.createUser(userdao);
	}
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	public void findUser(@RequestBody UserDto udto)
	{
		UserDao udao= new UserDao();
		BeanUtils.copyProperties(udto, udao);
	}
	@RequestMapping(value = "/flights",method = RequestMethod.GET)
   public List findFlights() {
	return userservice.findFlights();
	
}
}
