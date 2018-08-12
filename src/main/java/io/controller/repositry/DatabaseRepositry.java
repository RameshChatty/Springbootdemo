package io.controller.repositry;

import io.controller.entity.Customer;

import org.springframework.data.repository.CrudRepository;

public interface DatabaseRepositry  extends CrudRepository<Customer, Long>{

	
		
}
