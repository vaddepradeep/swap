package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.FlightsDao;

@Repository
public interface FlightRepo extends JpaRepository<FlightsDao, Long> {

}
