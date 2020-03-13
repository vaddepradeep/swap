package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.FlightsDao;

@Repository
public interface FlightRepo extends JpaRepository<FlightsDao, Long> {
	
	List findBySorceAndDestination(String sorce,String Destination);

}
