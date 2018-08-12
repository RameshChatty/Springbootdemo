package io.controller.dao;

import io.controller.entity.CopyOfCustomer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl extends BaseDaoImpl  implements CustomerDao {
	
	
	 @PersistenceContext
     private EntityManager em;

	@Override
	public List<CopyOfCustomer> getAllData() {
		Session s=getSession();
		Criteria crit = s.createCriteria(CopyOfCustomer.class);
        List<CopyOfCustomer> students = crit.list();
        return students;
	}

	@Override
	public void save(CopyOfCustomer customer) {
		Session s=getSession();
		s.save(customer);
		
	}
	
	
	
	

}
