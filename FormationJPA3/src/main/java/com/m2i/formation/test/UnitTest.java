package com.m2i.formation.test;

import static org.junit.Assert.*;

import java.util.List;

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
	
	@Test
	public void insertMedia()
	{
//		EntityManager em  = emf.createEntityManager();
//		EntityTransaction transac = em.getTransaction();
//		transac.begin();
//		
//		Media m = new Media();
//		m.setTitle("Le roi du monde");
//		m.setPrice((float) 7.99);
//		m.setCategory(2);
//		m.setType(0);
//		m.setPublisher(1);
//		em.persist(m);
//		transac.commit();
		
		
	}
	@Test
	public void countMedia()
	{
		EntityManager em  = emf.createEntityManager();
		Query sql = em.createQuery("select count(m) from Media m");
		assertEquals((long)6,sql.getSingleResult());
	}
	
	@Test
	public void selectPrice()
	{
		EntityManager em  = emf.createEntityManager();
		Query sql = em.createQuery("select m from Media m where price<10");
		List<Media> lm = sql.getResultList();
		
		for (Media med : lm)
		{
			System.out.println(med.getTitle()+"\t"+med.getPrice());
		}
	}
	@Test
	public void updateMedia()
	{
		EntityManager em  = emf.createEntityManager();
		EntityTransaction transac = em.getTransaction();
		transac.begin();
		Query sql = em.createQuery("UPDATE Media SET title = 'La reine du monde' WHERE title like '%monde'");
		int updateCount = sql.executeUpdate();
		System.out.println("Nb de modif =" +updateCount);
		transac.commit();		
	}
		
	@Test
	public void removeMedia()
	{
		EntityManager em  = emf.createEntityManager();
		EntityTransaction transac = em.getTransaction();
		transac.begin();
		Query sql = em.createQuery("DELETE FROM Media m WHERE title like '%monde'");
		int deletedCount = sql.executeUpdate();
		System.out.println("Nb de delete =" +deletedCount);
		transac.commit();
		
	}
}
