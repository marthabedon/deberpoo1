package com.encuestas.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.encuestas.repository.EstudianteRepository1;

@RestController
public class EstudianteController1 {

	@Autowired
	private EstudianteRepository1 estudianteRepository; 
	
}

