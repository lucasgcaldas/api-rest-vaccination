package com.lucasgcasldas.vaccinationapirest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasgcasldas.vaccinationapirest.enuns.User;
import com.lucasgcasldas.vaccinationapirest.repository.UserRepository;
import com.lucasgcasldas.vaccinationapirest.service.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public List<User> saveUsers(List<User> users) {
		return repo.saveAll(users);
	}
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	
}
