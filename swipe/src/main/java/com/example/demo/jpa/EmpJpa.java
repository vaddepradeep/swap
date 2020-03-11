package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmpActive;

public interface EmpJpa extends JpaRepository<EmpActive, Long> {

}
