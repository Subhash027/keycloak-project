package com.grootan.keycloak.demo.repository;

import com.grootan.keycloak.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	public User findByUsername(String username);
}
