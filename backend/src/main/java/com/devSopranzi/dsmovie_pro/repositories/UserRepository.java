package com.devSopranzi.dsmovie_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSopranzi.dsmovie_pro.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
User findByEmail(String email);	

}
