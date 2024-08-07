package com.madhu.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhu.portal.dao.EmployeRepository;
import com.madhu.portal.model.Employe;


@Service
public class EmloyeServiceImpl implements EmployeService {

	@Autowired
	private EmployeRepository employeRepository;

	@Override
	public List<Employe> findAll() {

		return employeRepository.findAll();
	}

//	@Override
//	public List<Employe> findByemployeName(String employeName) {
//	
//		return employeRepository.findByemployeName(employeName);
//	}
	
}
