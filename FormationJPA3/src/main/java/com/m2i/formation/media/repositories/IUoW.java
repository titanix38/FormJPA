package com.m2i.formation.media.repositories;

import javax.persistence.*;

import com.m2i.formation.media.entities.IEntity;

/**
 * Interface to create Entity Manager
 * @author Christophe
 *
 */
public interface IUoW
{

	public abstract EntityManager getEntityManager();

	public abstract void setEntityManager(EntityManager em);
	
	public abstract EntityTransaction getTransaction();

	public abstract void setTransaction(EntityTransaction et);
	
	public abstract void commit();
	
}
