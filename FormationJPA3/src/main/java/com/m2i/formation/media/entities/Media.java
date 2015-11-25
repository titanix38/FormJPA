package com.m2i.formation.media.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the media database table.
 * 
 */
@Entity
@Table(name="media")
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable,IEntity
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;

	private Integer category;

	@Temporal(TemporalType.DATE)
	private Date dateSortie;

	@Column(nullable=false)
	private Integer id_Publisher;

	@Column(length=25)
	private String isbn;

	@Column(length=25)
	private String lang;

	private Integer nbPage;

	private Integer nbTrack;

	@Column(nullable=false)
	private float price;

	@Column(nullable=false, length=25)
	private String title;

	@Column(nullable=false)
	private Integer type;

	public Media() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Date getDateSortie() {
		return this.dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Integer getId_Publisher() {
		return this.id_Publisher;
	}

	public void setId_Publisher(Integer id_Publisher) {
		this.id_Publisher = id_Publisher;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Integer getNbPage() {
		return this.nbPage;
	}

	public void setNbPage(Integer nbPage) {
		this.nbPage = nbPage;
	}

	public Integer getNbTrack() {
		return this.nbTrack;
	}

	public void setNbTrack(Integer nbTrack) {
		this.nbTrack = nbTrack;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}