package com.m2i.formation.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.*;

import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.ioc.*;
import com.m2i.formation.media.repositories.*;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.media.services.ServiceException;

@SuppressWarnings("unchecked")
public class SpringTest
{

	@Test
	public void testMedia()
	{
		Media med = (Media)ConstructObject.getInstance().getBean("media");
		assertNotNull(med);
	
	}
	@Test
	public void testMediaRepository()
	{
		Media2Repository medRep = ConstructObject.getInstance().getBean("media2Repository",Media2Repository.class);		
		
		IRepository<Media> mr = (IRepository<Media>)ConstructObject.getInstance().getBean("media2Repository");
		assertNotNull(medRep);
	}
	@Test
	public void testMainService() throws ServiceException
	{
		MainService ms = (MainService)ConstructObject.getInstance().getBean("mainService");		
		/*
		Author a = new Author();
		a.setFirstName("Albert");
		a.setLastName("EINSTEIN");
		
		
		assertNotNull(a);
		ms.addAuthorToMedia(a, 6);
		*/
		assertNotNull(ms.getMediaRepository().getAll());
		
	}

}
