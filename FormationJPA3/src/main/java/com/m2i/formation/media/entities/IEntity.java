package com.m2i.formation.media.entities;

import java.util.Date;

public interface IEntity
{
	public Integer getId();

	public void setId(Integer id);

	public Integer getCategory();

	public void setCategory(Integer category);

	public Date getDateSortie();

	public void setDateSortie(Date dateSortie);

	public Integer getId_Publisher();

	public void setId_Publisher(Integer id_Publisher);

	public String getIsbn();

	public void setIsbn(String isbn);

	public String getLang();
	
	public void setLang(String lang);

	public Integer getNbPage();

	public void setNbPage(Integer nbPage);

	public Integer getNbTrack();

	public void setNbTrack(Integer nbTrack);

	public float getPrice();

	public void setPrice(float price);

	public String getTitle();

	public void setTitle(String title);
	
	public Integer getType();

	public void setType(Integer type);
}
