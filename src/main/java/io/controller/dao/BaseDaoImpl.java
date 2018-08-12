package io.controller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

public class BaseDaoImpl {

	@PersistenceContext
    private EntityManager em;
	
	public Session getSession(){
		
		return em.unwrap(Session.class);
	}

}
