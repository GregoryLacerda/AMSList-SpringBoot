package com.gregory.amslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gregory.amslist.entities.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long>{

}
