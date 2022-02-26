package com.gregory.amslist.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gregory.amslist.entities.Anime;
import com.gregory.amslist.entities.Manga;
import com.gregory.amslist.entities.Serie;
import com.gregory.amslist.entities.User;
import com.gregory.amslist.entities.enums.Status;
import com.gregory.amslist.repositories.AnimeRepository;
import com.gregory.amslist.repositories.MangaRepository;
import com.gregory.amslist.repositories.SerieRepository;
import com.gregory.amslist.repositories.UserRepository;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MangaRepository mangaRepository;
	
	@Autowired
	SerieRepository serieRepository;
	
	@Autowired
	AnimeRepository animeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria ", "maria@gmail", "123456");
		User u2 = new User(null, "Alex ", "alex@gmail", "123456"); 
		
		
		Manga mg1 = new Manga(null, "musoku2", "cover1", "site1", "descri1", u2, Status.WATCHING, 2.0, 3.7);
		Manga mg2 = new Manga(null, "musoku2", "cover2", "site2", "descri2", u1, Status.COMPLETED, 2.0, 3.7);
		Manga mg3 = new Manga(null, "musoku3", "cover3", "site3", "descri3", u2, Status.WATCHING, 2.0, 3.7);
		
		Serie se1 = new Serie(null, "Serie musoku2", "cover1", "site1", "descri1", u2, Status.WATCHING, 2.0, 3.7);
		
		Anime am1 = new Anime(null, "Anime musoku2", "cover1", "site1", "descri1", u2, Status.WATCHING, 2.0, 3.7);
		
		//saveall precisa de uma lista, arrays.aslist cria a lista com os dois objetos
		userRepository.saveAll(Arrays.asList(u1, u2));	
		
		mangaRepository.saveAll(Arrays.asList(mg1, mg2, mg3));
		
		serieRepository.saveAll(Arrays.asList(se1));
		
		animeRepository.saveAll(Arrays.asList(am1));
	}

}
