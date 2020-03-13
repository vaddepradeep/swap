package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FlightsDao;
import com.example.demo.dao.UserDao;
import com.example.demo.repo.FlightRepo;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userrepo;
	private FlightRepo flightRepo;
	public void createUser(UserDao dao)
	{
		userrepo.save(dao);
	}

public UserDao findUser(UserDao dao)
{
	return userrepo.findByUsernameAndPwd(dao.getUsername(), dao.getPwd()) ;
	
}
 public List <FlightsDao>findFlights()
{
	return flightRepo.findAll();
	
}
}
