package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FindFlightsDao;
import com.example.demo.dao.FlightsDao;
import com.example.demo.dao.PassigerDao;
import com.example.demo.dao.UserDao;
import com.example.demo.repo.FlightRepo;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userrepo;
	private FlightRepo flightrepo;
	public void createUser(UserDao dao)
	{
		userrepo.save(dao);
	}

public UserDao findUser(UserDao dao)
{
	return userrepo.findByUsernameAndPwd(dao.getUsername(), dao.getPwd()) ;
	
}
 public List <FlightsDao>findFlights(FindFlightsDao dao)
{
	return flightrepo.findBySorceAndDestination(dao.getSorce(), dao.getDestination());
}
	public void createFlight(FlightsDao fdao)
	{
	boolean b=flightrepo.existsById(fdao.getFlightid());
	if(b==false)
	{
		flightrepo.save(fdao);
	}
	
	
	
	}	
}

