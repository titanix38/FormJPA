package com.m2i.formation.test;

import static org.junit.Assert.*;

import javax.persistence.*;

import org.junit.Test;

public class UnitTest
{

	@Test
	public void test()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FormationJPA");
		assertNotNull(emf);
		EntityManager em = emf.createEntityManager();
		assertNotNull(em);
	}

}
