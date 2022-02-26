package com.gregory.amslist.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregory.amslist.entities.Anime;
import com.gregory.amslist.services.AnimeService;

@RestController
@RequestMapping(value = "/animes")
public class AnimeResoruce {
	
	@Autowired
	private AnimeService animeService;
	
	@GetMapping
	public ResponseEntity<List<Anime>> findAll(){
		List<Anime> list = animeService.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Anime> findById(@PathVariable Long id){
		Anime anime = animeService.findById(id);
		return ResponseEntity.ok().body(anime);	}
}
