package com.devSopranzi.dsmovie_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSopranzi.dsmovie_pro.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	

}
