package com.lucasgcasldas.vaccinationapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucasgcasldas.vaccinationapirest.enuns.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
