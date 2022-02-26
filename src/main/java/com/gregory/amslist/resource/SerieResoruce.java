package com.gregory.amslist.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregory.amslist.entities.Serie;
import com.gregory.amslist.services.SerieService;

@RestController
@RequestMapping(value = "/series")
public class SerieResoruce {
	
	@Autowired
	private SerieService serieService;
	
	@GetMapping
	public ResponseEntity<List<Serie>> findAll(){
		List<Serie> list = serieService.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Serie> findById(@PathVariable Long id){
		Serie serie = serieService.findById(id);
		return ResponseEntity.ok().body(serie);	}
}
