package com.gregory.amslist.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.gregory.amslist.entities.enums.Status;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Element implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	private String coverImage;
	private String siteLink;
	private String description;
	private Integer status;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User client;
	
	

	//Constructors
	public Element() {
	}

	public Element(Long id, String name, String coverImage, String siteLink, String description, User user, Status status) {
		this.id = id;
		this.name = name;
		this.coverImage = coverImage;
		this.siteLink = siteLink;
		this.description = description;
		this.client = user;
		setStatus(status);
	}
	
	//Getter and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getSiteLink() {
		return siteLink;
	}

	public void setSiteLink(String siteLink) {
		this.siteLink = siteLink;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return client;
	}

	public void setUser(User user) {
		this.client = user;
	}

	public Status getStatus() {
		return Status.valueOf(status);
	}

	public void setStatus(Status status) {
		if (status != null) {
			this.status = status.getCode();
		}
	}
	
	//HashCode and Equals
	@Override
	public int hashCode() {
		return Objects.hash(name, siteLink);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		return Objects.equals(name, other.name) && Objects.equals(siteLink, other.siteLink);
	}

	//ToString
	@Override
	public String toString() {
		return "[Id: " + id + ", Name: " + name + ", CoverImage: " + coverImage + ", SiteLink: " + siteLink
				+ ", Description: " + description + " ]";
	}

}
