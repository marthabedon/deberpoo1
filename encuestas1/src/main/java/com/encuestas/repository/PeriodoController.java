package com.encuestas.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.encuestas.domain.PERIODOS;
import com.encuestas.repository.PeriodoRepository;


@RestController
public class PeriodoController {

	@Autowired
	private PeriodoRepository  periodoRepository;
	
	 @RequestMapping (value= "/periodo",method = RequestMethod.POST)
	    public ResponseEntity<?> crearPeriodo(@RequestBody PERIODOS periodosLectivos){
		 periodoRepository.save(periodosLectivos);
	        return new ResponseEntity<>(periodosLectivos,HttpStatus.CREATED);
	    }
	    
	    @RequestMapping (value= "/periodo",method = RequestMethod.GET)
	    public ResponseEntity<?> ConsultarPeriodo(){
	        Iterable<PERIODOS> periodosLectivos= periodoRepository.findAll();
	        return new ResponseEntity<>(periodosLectivos,HttpStatus.OK);
	    }
	    
	    @RequestMapping (value = "/periodo/{periodo_id}",method = RequestMethod.GET)
	    public ResponseEntity<?> BuscarPeriodo(@PathVariable int periodo_id){
	    	PERIODOS periodosLectivos= periodoRepository.findOne(periodo_id);
	        return new ResponseEntity<>(periodosLectivos,HttpStatus.OK); 
	    }
	    
	    @RequestMapping (value = "/periodo/{periodo_id}",method = RequestMethod.PUT)
	    public ResponseEntity<?> modificarPeriodo(@RequestBody PERIODOS periodosLectivos,@PathVariable int periodo_id){
	    	periodoRepository.save(periodosLectivos);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	    
	    @RequestMapping (value = "/periodo/{periodo_id}",method = RequestMethod.DELETE)
	    public ResponseEntity<?> eliminarPeriodo(@PathVariable int periodo_id){
	    	periodoRepository.delete(periodo_id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	}