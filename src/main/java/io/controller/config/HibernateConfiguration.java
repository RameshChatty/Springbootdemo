/*package io.controller.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfiguration {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;
	
	@Bean
	public SessionFactory 	getSessionFactory(){
		if(em.unwrap(SessionFactory.class)==null){
			throw new NullPointerException("is not a hibernazte factory");
		}
		return em.unwrap(SessionFactory.class);
	}
	
	@Bean
    public SessionFactory getSessionFactory() {
        if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        return entityManagerFactory.unwrap(SessionFactory.class);
    }
	
	
}
*/