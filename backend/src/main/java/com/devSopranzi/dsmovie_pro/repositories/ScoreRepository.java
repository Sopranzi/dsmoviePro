package com.devSopranzi.dsmovie_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSopranzi.dsmovie_pro.entities.Score;
import com.devSopranzi.dsmovie_pro.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	

}
