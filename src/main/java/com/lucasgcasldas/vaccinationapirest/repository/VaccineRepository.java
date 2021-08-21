package com.lucasgcasldas.vaccinationapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgcasldas.vaccinationapirest.enuns.Vaccine;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {
	
}
