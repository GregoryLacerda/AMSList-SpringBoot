package com.gregory.amslist.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gregory.amslist.entities.Serie;
import com.gregory.amslist.repositories.SerieRepository;

@Service
public class SerieService {
	
	@Autowired
	private SerieRepository serieRepository;
	
	public List<Serie> findAll(){
		return serieRepository.findAll();		 
	}
	
	public Serie findById(Long Id){
		Optional<Serie> obj = serieRepository.findById(Id);
		return obj.get();
	}
}
