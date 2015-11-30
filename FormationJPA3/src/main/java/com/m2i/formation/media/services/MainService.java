package com.m2i.formation.media.services;

import javax.persistence.*;

import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.repositories.*;
import com.m2i.formation.test.EMFAlone;

public class MainService implements IMainService
{

	private MediaRepository mediaRepository;

	public MediaRepository getMediaRepository()
	{
		return mediaRepository;
	}

	public void setMediaRepository(MediaRepository mediaRepository)
	{
		this.mediaRepository = mediaRepository;
	}

	public AuthorRepository getAuthorRepository()
	{
		return authorRepository;
	}

	public void setAuthorRepository(AuthorRepository authorRepository)
	{
		this.authorRepository = authorRepository;
	}

	private AuthorRepository authorRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.m2i.formation.media.services.IMainService#addAuthorToMedia(com.m2i.
	 * formation.media.entities.Author, int)
	 */
	@Override
	public void addAuthorToMedia(Author a, int mediaId) throws ServiceException
	{
//		EntityManagerFactory emf = EMFAlone.getInstance();
//		EntityManager em = emf.createEntityManager();	
//		Media2Repository mediaRepository = new Media2Repository();
//		mediaRepository.setEntityManager(em);		
		
		Media m = mediaRepository.getById(mediaId);

		if (m != null)
		{
			if (!m.getAuthors().contains(a))
			{
				mediaRepository.getTransaction();
				m.getAuthors().add(a);
				mediaRepository.save(m);
				mediaRepository.commit();

			} else
			{
				throw new ServiceException("This authors is already associated with the media");
			}
		} else
		{
			throw new ServiceException("The media does not exist !!!");
		}
	}
}
