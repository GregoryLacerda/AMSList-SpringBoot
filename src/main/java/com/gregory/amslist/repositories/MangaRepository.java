package com.gregory.amslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gregory.amslist.entities.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long>{

}
