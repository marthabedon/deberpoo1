/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuestas.repository;

import com.encuestas.domain.PRODUCTO1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author W ANDRADE M
 */
@RestController
public class DeberControl {
    
    @Autowired
    private DeberRepositorio er;
    
        @RequestMapping(value="/taller/{idproducto}", method = RequestMethod.GET)
	public ResponseEntity<?> getEncuesta(@PathVariable int idproducto){
		Iterable<PRODUCTO1> producto =er.findAll();
		return new ResponseEntity<>(producto,HttpStatus.OK);
	}

       @RequestMapping(value="/taller", method = RequestMethod.GET)
	public ResponseEntity<?> normal(){
		Iterable<PRODUCTO1> producto =er.findAll();
		return new ResponseEntity<>(producto,HttpStatus.OK);
	}

}
