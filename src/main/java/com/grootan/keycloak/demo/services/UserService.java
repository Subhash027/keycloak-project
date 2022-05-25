package com.grootan.keycloak.demo.services;


import com.grootan.keycloak.demo.Entity.User;
import com.grootan.keycloak.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
	@Autowired
	UserRepository userRepository;

	public User getUserByUsername(String username)
	{
		return userRepository.findByUsername(username);
	}
}
