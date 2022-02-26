package com.gregory.amslist.entities;

import javax.persistence.Entity;

import com.gregory.amslist.entities.enums.Status;

@Entity
public class Manga extends Element {

	private static final long serialVersionUID = 1L;
	
	private Double volume;
	private Double chapter;
	
	public Manga() {
		super();
	}
	
	
	public Manga(Long id, String name, String coverImage, String siteLink, String description, User user, Status status,
			Double volume, Double chapter) {
		super(id, name, coverImage, siteLink, description, user, status);
		this.volume = volume;
		this.chapter = chapter;
	}

	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public Double getChapter() {
		return chapter;
	}
	public void setChapter(Double chapter) {
		this.chapter = chapter;
	}
	
	
	
}
