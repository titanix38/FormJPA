package com.m2i.formation.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.junit.Test;

import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.repositories.MediaRepository;

public class MediaRepositoryTest
{

	private EntityManagerFactory emf = EMFAlone.getInstance();
	private EntityManager em;
	
	private MediaRepository mr = new MediaRepository();	
	private List<Media> lm = new ArrayList<Media>();
	private Media med = new Media();
	
	@Test
	public void setEntityManagerTest()
	{
		mr.setEntityManager(emf.createEntityManager());
		assertNotNull(mr);
	}
	
	
	@Test
	public void getAllTest()
	{
		lm = mr.getAll();
		assertNotNull(lm);
		
	}
	@Test
	public void getByIdTest()
	{	
		med = mr.getById(1);
		System.out.println(med.getTitle());
		assertNotNull(med);
	}
	
//	@Test
//	public void createTest()
//	{	
//		mr.setTransaction(mr.getEntityManager().getTransaction());
//		mr.getTransaction();
//		Media m = new Media();
//		m.setTitle("Sparadrah le PGM");
//		m.setPrice((float) 9.99);
//		m.setCategory(0);
//		m.setPublisher(1);
//		m.setType(0);
//		
//		med = mr.create(m);
//		mr.commit();
//		assertNotNull(med);
//	}
	
	
	
}
