package com.madhu.portal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.portal.model.Employe;


public interface EmployeRepository extends JpaRepository<Employe, Integer> {
	
//	 List<Employe> findByemployeName(String employeName);
	
}
