package com.lucasgcasldas.vaccinationapirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasgcasldas.vaccinationapirest.repository.VaccineRepository;

@RestController
@RequestMapping("/vacina")
public class VaccinationController {

	@Autowired
	VaccineRepository repository;
	
	@GetMapping
	public ResponseEntity teste(@RequestBody String teste) {
		return ResponseEntity.ok(teste);
	}
	
	
}
