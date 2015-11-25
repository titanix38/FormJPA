package com.m2i.formation.test;

import static org.junit.Assert.*;

import javax.persistence.*;

import org.junit.Test;

import com.m2i.formation.media.entities.Media;

public class UnitTest
{

	private EntityManagerFactory emf = EMFAlone.getInstance();
	@Test
	public void test()
	{		
		EntityManager em = emf.createEntityManager();
		assertNotNull(em);
	}
	@Test
	public void MediaTitleTest()
	{		
		EntityManager em = emf.createEntityManager();
		Media m = em.find(Media.class, 1);
		assertEquals("Tintin et le java", m.getTitle());
	}
	@Test
	public void MediaPriceTest()
	{		
		EntityManager em = emf.createEntityManager();
		Media m = em.find(Media.class, 2);
		assertEquals(9.99, m.getPrice(),0.1);
		
	}

}
