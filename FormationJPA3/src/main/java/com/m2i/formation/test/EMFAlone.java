package com.m2i.formation.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFAlone
{
	private EMFAlone(){}	
	
	private static EntityManagerFactory instance;

	public static synchronized EntityManagerFactory getInstance()
	{
		if (instance == null)
		{
			instance = Persistence.createEntityManagerFactory("FormationJPA");
		}
		return instance;
	}
}
