package com.gregory.amslist.entities;

import javax.persistence.Entity;

import com.gregory.amslist.entities.enums.Status;

@Entity
public class Anime extends Element {

	private static final long serialVersionUID = 1L;
	
	private Double season;
	private Double episode;
	
	public Anime() {
		super();
	}
	
	
	public Anime(Long id, String name, String coverImage, String siteLink, String description, User user, Status status,
			Double season, Double episode) {
		super(id, name, coverImage, siteLink, description, user, status);
		this.season = season;
		this.episode = episode;
	}

	public Double getVolume() {
		return season;
	}
	public void setVolume(Double season) {
		this.season = season;
	}
	public Double getChapter() {
		return episode;
	}
	public void setChapter(Double episode) {
		this.episode = episode;
	}
	
	
	
}
