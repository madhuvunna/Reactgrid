package com.madhu.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.madhu.portal.model.Employe;
import com.madhu.portal.service.EmployeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employe")
public class EmployeController {

	@Autowired
	private EmployeService employeService;

	@RequestMapping(value = "/getEmploye", method = RequestMethod.GET)

	public ResponseEntity<Object> getEmploye() {

		List<Employe> employleList = employeService.findAll();
		return new ResponseEntity<>(employleList, HttpStatus.OK);
	}

//	@RequestMapping(value = "/getName", method = RequestMethod.GET)
//
//	public ResponseEntity<List<Employe>> findbyemployeName(@RequestParam String employeName) {
//
//		return new ResponseEntity<List<Employe>>(employeService.findByemployeName(employeName), HttpStatus.OK);
//
//	}

}
