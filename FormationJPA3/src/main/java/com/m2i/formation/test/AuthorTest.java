package com.m2i.formation.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.m2i.formation.media.entities.Author;
import com.m2i.formation.media.repositories.MediaRepository;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.media.services.ServiceException;

public class AuthorTest
{
//	private MediaRepository mr = new MediaRepository();

	@Test
	public void addAuthorTest() throws ServiceException
	{
		MainService ms = new MainService();
		
		Author aut = new Author();
		aut.setLastName("Einstein");
		aut.setFirstName("Albert");
//		aut.setId(5);

		ms.addAuthorToMedia(aut, 6);
		
//		assertE

//		List<Author> la = mr.getById(2).getAuthors();
//
//		for (Author a : la)
//		{
//			System.out.println(a.getFirstName() + " " + a.getLastName());
//		}
//
//		assertNotNull(la);
	}

}
