package com.m2i.formation.media.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Query;

import com.m2i.formation.media.entities.IEntity;
import com.m2i.formation.media.entities.Media;
import com.m2i.formation.test.EMFAlone;

public class MediaRepository extends AbstractRepository<Media> implements IUoW, IRepository<Media>
{

	private EntityManagerFactory emf = EMFAlone.getInstance();
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction transaction;

//	@Override
//	public void commit()
//	{
//		et.commit();
//	}

	@Override
	public EntityTransaction getTransaction()
	{
		return this.transaction;
	}

	@Override
	public void setTransaction(EntityTransaction et)
	{
		this.transaction = et;
	}

	@Override
	public EntityManager getEntityManager()
	{
		return this.em;
	}

	@Override
	public void setEntityManager(EntityManager em)
	{
		this.em = em;
	}

	@SuppressWarnings("unchecked")	
	@Override	
	public List<Media> getAll()
	{
		Query query = getEntityManager().createQuery("select m from Media m");
		return query.getResultList();
	}

	@Override
	public Media getById(int id)
	{
		return getEntityManager().find(Media.class, id);
	}

	public Media create(Media entity)
	{
		getEntityManager().persist(entity);
		return entity;
	}

	@Override
	public Media update(Media entity)
	{
		return getEntityManager().merge(entity);
	}

	@Override
	public Media save(Media entity)
	{
		getEntityManager().persist(entity);
		return entity;
	}

	@Override
	public void remove(Media entity)
	{
		Query query = em.createQuery("DELETE FROM Media m WHERE m.id = entity.id");
		query.executeUpdate();
	}

}
