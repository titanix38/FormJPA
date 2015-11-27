package com.m2i.formation.media.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

public class ConstructObject
{
	private ConstructObject(){}	
	
	
	private static ApplicationContext instance;

	
	public static synchronized ApplicationContext getInstance()
	{
		if (instance == null)
		{
			instance = new ClassPathXmlApplicationContext("spring.xml");				// Tres lente : On en fait un singleton
		}
		return instance;
	}
}
