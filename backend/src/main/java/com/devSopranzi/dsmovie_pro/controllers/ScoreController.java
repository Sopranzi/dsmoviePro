package com.devSopranzi.dsmovie_pro.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSopranzi.dsmovie_pro.dto.MovieDTO;
import com.devSopranzi.dsmovie_pro.dto.ScoreDTO;

@RestController
@RequestMapping(value= "/scores")
public class ScoreController {

	
	@PutMapping
	public MovieDTO saveScore(ScoreDTO dto){
		return null;
	}
}
