package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.FindFlightsDao;
import com.example.demo.dao.FlightsDao;
import com.example.demo.dao.PassigerDao;
import com.example.demo.dao.UserDao;
import com.example.demo.dto.FindFlightDto;
import com.example.demo.dto.FlightDto;
import com.example.demo.dto.PassingerDto;
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
	public void findUser(UserDto udto)
	{
		UserDao udao= new UserDao();
		BeanUtils.copyProperties(udto, udao);
	}
	@RequestMapping(value="/createflight",consumes = "application/json")
	public void createFlight(@RequestBody FlightDto fdto)
	{
		FlightsDao  fdao=new FlightsDao(); 
		BeanUtils.copyProperties(fdto, fdao);
		
	}
	@RequestMapping(value = "/flights",method = RequestMethod.GET)
   public List findFlights( FindFlightDto find) {
		FindFlightsDao dao= new FindFlightsDao();
		BeanUtils.copyProperties(find, dao);
		
	return userservice.findFlights(dao);
			
	
}
	@RequestMapping(value="/createpassinger",method = RequestMethod.POST)
	public void createpassinger(@RequestBody PassingerDto dto)
	{
		PassigerDao dao= new PassigerDao();
		BeanUtils.copyProperties(dto, dao);
		//userservice.
	}
	{
		
	}
}
