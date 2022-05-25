package com.grootan.keycloak.demo.repository;

import com.grootan.keycloak.demo.Entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Long>
{
}
