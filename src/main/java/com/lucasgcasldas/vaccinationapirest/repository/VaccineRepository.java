package com.lucasgcasldas.vaccinationapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasgcasldas.vaccinationapirest.enuns.Vacina;

public interface VaccineRepository extends JpaRepository<Vacina, Long> {
	
}
