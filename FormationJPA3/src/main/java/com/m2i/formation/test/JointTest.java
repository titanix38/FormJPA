package com.m2i.formation.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.junit.Test;

import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.repositories.MediaRepository;

public class JointTest
{
	private EntityManagerFactory emf = EMFAlone.getInstance();
	private MediaRepository mr = new MediaRepository();
	
	@Test
	public void publisherNametest()
	{
		mr.setEntityManager(emf.createEntityManager());
		List<Author> la = mr.getById(2).getAuthors();
		
		for(Author a:la)
		{
			System.out.println(a.getFirstName()+" "+a.getLastName());
		}
		
		assertNotNull(la);
	}

}
