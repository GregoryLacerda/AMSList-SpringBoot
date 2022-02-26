package com.gregory.amslist.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gregory.amslist.entities.Manga;
import com.gregory.amslist.repositories.MangaRepository;

@Service
public class MangaService {
	
	@Autowired
	private MangaRepository mangaRepository;
	
	public List<Manga> findAll(){
		return mangaRepository.findAll();		 
	}
	
	public Manga findById(Long Id){
		Optional<Manga> obj = mangaRepository.findById(Id);
		return obj.get();
	}
}
