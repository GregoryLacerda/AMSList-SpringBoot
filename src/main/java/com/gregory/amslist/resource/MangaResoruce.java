package com.gregory.amslist.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregory.amslist.entities.Manga;
import com.gregory.amslist.services.MangaService;

@RestController
@RequestMapping(value = "/mangas")
public class MangaResoruce {
	
	@Autowired
	private MangaService mangaService;
	
	@GetMapping
	public ResponseEntity<List<Manga>> findAll(){
		List<Manga> list = mangaService.findAll(); 
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Manga> findById(@PathVariable Long id){
		Manga manga = mangaService.findById(id);
		return ResponseEntity.ok().body(manga);	}
}
