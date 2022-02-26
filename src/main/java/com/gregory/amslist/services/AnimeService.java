package com.gregory.amslist.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gregory.amslist.entities.Anime;
import com.gregory.amslist.repositories.AnimeRepository;

@Service
public class AnimeService {
	
	@Autowired
	private AnimeRepository animeRepository;
	
	public List<Anime> findAll(){
		return animeRepository.findAll();		 
	}
	
	public Anime findById(Long Id){
		Optional<Anime> obj = animeRepository.findById(Id);
		return obj.get();
	}
}
